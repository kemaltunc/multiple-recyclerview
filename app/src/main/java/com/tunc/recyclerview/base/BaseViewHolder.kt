package com.tunc.recyclerview.base

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer

@Suppress("UNCHECKED_CAST")
abstract class BaseViewHolder<M : BaseModel> :
    RecyclerView.ViewHolder, LayoutContainer {

    constructor(itemView: View) : super(itemView)

    constructor(parent: ViewGroup, @LayoutRes layoutId: Int) : this(
        LayoutInflater.from(parent.context).inflate(
            layoutId,
            parent,
            false
        )
    )

    override val containerView: View?
        get() = this.itemView

    abstract fun bind(item: M)

    internal fun bindItem(item: M) {
        bind(item)
    }


}