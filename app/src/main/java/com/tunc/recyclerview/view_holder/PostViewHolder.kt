package com.tunc.recyclerview.view_holder

import android.annotation.SuppressLint
import android.view.ViewGroup
import com.tunc.recyclerview.R
import com.tunc.recyclerview.adapter.PostAdapter
import com.tunc.recyclerview.base.BaseModel
import com.tunc.recyclerview.base.BaseViewHolder
import com.tunc.recyclerview.model.MainInterface
import com.tunc.recyclerview.model.PostModel
import com.tunc.recyclerview.utils.PostEnums
import com.tunc.recyclerview.utils.horizantal
import com.tunc.recyclerview.utils.vertical
import kotlinx.android.synthetic.main.cell_post_item.view.*

class PostViewHolder(parent: ViewGroup, private val mainInterface: MainInterface) :
    BaseViewHolder<BaseModel, PostModel>(parent, LAYOUT_ID) {

    private val postAdapter by lazy { PostAdapter(mainInterface) }
    @SuppressLint("SetTextI18n")
    override fun bind(item: PostModel) {

        itemView.cell_post_title.text = item.title

        when (item.type) {
            PostEnums.STORY_POST -> postAdapter.horizantal(itemView.cell_post_recyclerview)
            PostEnums.NORMAL_POST -> postAdapter.vertical(itemView.cell_post_recyclerview)

            else -> postAdapter.horizantal(itemView.cell_post_recyclerview)
        }

        postAdapter.items = item.postList!!

    }

    companion object {
        const val LAYOUT_ID = R.layout.cell_post_item
    }
}