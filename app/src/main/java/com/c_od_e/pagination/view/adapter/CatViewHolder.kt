package com.c_od_e.pagination.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.c_od_e.pagination.R
import com.c_od_e.pagination.databinding.ItemCatBinding
import com.c_od_e.pagination.model.Cat

class CatViewHolder(private val binding: ItemCatBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: Cat?, onclick: ()->Any, remove: ()->Any) {
        binding.imageCat.load(item?.url) {
            placeholder(R.drawable.ic_launcher_background)
        }
        binding.bgItem.setBackgroundColor(if (item?.check == true) ContextCompat.getColor(binding.root.context, R.color.black) else ContextCompat.getColor(binding.root.context, R.color.white))
        binding.bgItem.setOnClickListener {
            remove.invoke()
//            item?.check = !item?.check!!
//            onclick.invoke()
        }
    }

    companion object {
        fun create(view: ViewGroup): CatViewHolder {
            val inflater = LayoutInflater.from(view.context)
            val binding = ItemCatBinding.inflate(inflater, view, false)
            return CatViewHolder(binding)
        }
    }
}