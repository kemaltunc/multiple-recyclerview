package com.tunc.recyclerview.view_holder

import android.annotation.SuppressLint
import android.view.ViewGroup
import com.tunc.recyclerview.R
import com.tunc.recyclerview.adapter.PostAdapter
import com.tunc.recyclerview.base.BaseModel
import com.tunc.recyclerview.base.BaseViewHolder
import com.tunc.recyclerview.model.MainInterface
import com.tunc.recyclerview.model.NormalPost
import com.tunc.recyclerview.model.PostModel
import com.tunc.recyclerview.utils.PostEnums
import com.tunc.recyclerview.utils.horizantal
import com.tunc.recyclerview.utils.vertical
import kotlinx.android.synthetic.main.cell_post_item.view.*

class NormalPostViewHolder(parent: ViewGroup, private val mainInterface: MainInterface) :
    BaseViewHolder<BaseModel, NormalPost>(parent, LAYOUT_ID) {

    @SuppressLint("SetTextI18n")
    override fun bind(item: NormalPost) {

    }

    companion object {
        const val LAYOUT_ID = R.layout.cell_normal_item
    }
}