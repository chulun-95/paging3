package com.c_od_e.pagination.view.network

import androidx.hilt.lifecycle.ViewModelInject
import androidx.paging.ExperimentalPagingApi
import com.c_od_e.pagination.core.BaseViewModel
import com.c_od_e.pagination.data.CatsRepository
import com.c_od_e.pagination.model.Cat
import com.c_od_e.pagination.view.db.Actions

@ExperimentalPagingApi
class NetworkOnlyViewModel @ViewModelInject constructor(private val repository: CatsRepository) :
    BaseViewModel() {
    override val dataSource = repository.getCatsFromNetwork()
    override fun removeItem(it: Cat) {
        modifications.value += Actions.Remove(it)
    }
}