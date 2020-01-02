package com.tunc.recyclerview.base

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlin.properties.Delegates


abstract class BaseAdapter<M : BaseModel, VH : BaseViewHolder<M>> : RecyclerView.Adapter<VH>(),
    DiffAdapter {

    var items: List<M> by Delegates.observable(emptyList()) { _, old, new ->
        this@BaseAdapter.notifyDiff(old, new)
    }

    override fun getItemViewType(position: Int) = items[position].layoutId
    override fun getItemCount() = items.size
    override fun onBindViewHolder(holder: VH, position: Int) = holder.bindItem(items[position])
    abstract override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH
}