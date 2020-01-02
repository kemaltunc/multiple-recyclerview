package com.tunc.recyclerview.adapter

import android.view.ViewGroup
import com.tunc.recyclerview.base.BaseAdapter
import com.tunc.recyclerview.base.BaseModel
import com.tunc.recyclerview.base.BaseViewHolder
import com.tunc.recyclerview.model.MainInterface
import com.tunc.recyclerview.view_holder.PostViewHolder

class MainAdapter constructor(val mainInterface: MainInterface) :
    BaseAdapter<BaseModel, BaseViewHolder<BaseModel>>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = when (viewType) {
        PostViewHolder.LAYOUT_ID -> PostViewHolder(parent,mainInterface)
        else -> PostViewHolder(parent,mainInterface)
    } as BaseViewHolder<BaseModel>

}