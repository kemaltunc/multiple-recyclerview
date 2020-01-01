package com.tunc.recyclerview.view_holder

import android.annotation.SuppressLint
import android.view.ViewGroup
import com.tunc.recyclerview.R
import com.tunc.recyclerview.base.BaseModel
import com.tunc.recyclerview.base.BaseViewHolder
import com.tunc.recyclerview.model.MainInterface
import com.tunc.recyclerview.model.StoryPost

class StoryViewHolder(parent: ViewGroup, private val mainInterface: MainInterface) :
    BaseViewHolder<BaseModel, StoryPost>(parent, LAYOUT_ID) {
    @SuppressLint("SetTextI18n")
    override fun bind(item: StoryPost) {


    }

    companion object {
        const val LAYOUT_ID = R.layout.cell_story_item
    }
}