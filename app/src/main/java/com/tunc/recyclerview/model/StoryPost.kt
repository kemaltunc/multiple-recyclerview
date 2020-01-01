package com.tunc.recyclerview.model

import com.tunc.recyclerview.R
import com.tunc.recyclerview.base.BaseModel
import com.tunc.recyclerview.view_holder.StoryViewHolder

class StoryPost(
    postId: String? = "",
    imageUrl: String? = ""
) : BaseModel(StoryViewHolder.LAYOUT_ID)