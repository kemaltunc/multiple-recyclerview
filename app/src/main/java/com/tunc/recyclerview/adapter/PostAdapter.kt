package com.tunc.recyclerview.adapter

import android.view.ViewGroup
import com.tunc.recyclerview.base.BaseAdapter
import com.tunc.recyclerview.base.BaseModel
import com.tunc.recyclerview.base.BaseViewHolder
import com.tunc.recyclerview.model.MainInterface
import com.tunc.recyclerview.view_holder.NormalPostViewHolder
import com.tunc.recyclerview.view_holder.StoryViewHolder


class PostAdapter constructor(val mainInterface: MainInterface) :
    BaseAdapter<BaseModel, BaseViewHolder<BaseModel, Any>>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = when (viewType) {
        StoryViewHolder.LAYOUT_ID -> StoryViewHolder(parent, mainInterface)
        NormalPostViewHolder.LAYOUT_ID -> NormalPostViewHolder(parent, mainInterface)
        else -> NormalPostViewHolder(parent, mainInterface)
    } as BaseViewHolder<BaseModel, Any>

}