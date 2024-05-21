package com.c_od_e.pagination.core

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.*
import com.c_od_e.pagination.model.Cat
import com.c_od_e.pagination.model.CatListItem
import com.c_od_e.pagination.view.db.Actions
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.map

abstract class BaseViewModel : ViewModel() {
    open fun removeItem(it: Cat){

    }
    open val modifications = MutableStateFlow<List<Actions>>(emptyList())
    abstract val dataSource: Flow<PagingData<Cat>>


    val cats: Flow<PagingData<CatListItem>> by lazy {
        dataSource
            .map { pagingData -> pagingData.map { CatListItem.CatItem(it) } }
            .map {
                it.insertSeparators { before, after ->
                    if (after == null) {
                        return@insertSeparators null
                    }

                    val nameOfAfterItem = after.cat.id.first().toString()

                    if (before == null) {
                        return@insertSeparators CatListItem.SeparatorItem(
                            nameOfAfterItem,
                        )
                    }

                    val nameOfBeforeItem = before.cat.id.first().toString()
                    if (nameOfBeforeItem != nameOfAfterItem) {
                        return@insertSeparators CatListItem.SeparatorItem(
                            nameOfAfterItem
                        )
                    } else {
                        null
                    }
                }
            }.cachedIn(viewModelScope).combine(modifications) { pagingdata, modifications ->
                modifications.fold(pagingdata) { paging, event ->
                    applyActions(paging, event)
                }
            }
    }

    private fun applyActions(
        pagingData: PagingData<CatListItem>,
        actions: Actions
    ): PagingData<CatListItem> {
        return when (actions) {
            is Actions.Remove -> {
                pagingData
                    .filter { it is CatListItem.CatItem &&  actions.item.id != it.cat.id }
            }

//            is Actions.Insert -> {
//                // to add item at bottom
//                pagingData.insertFooterItem(actions.item)
//
//                // to add item at top
//                pagingData.insertHeaderItem(actions.item)
//            }

            else -> {
                pagingData
            }
        }
    }
}