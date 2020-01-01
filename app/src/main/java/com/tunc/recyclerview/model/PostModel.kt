package com.tunc.recyclerview.model

import com.tunc.recyclerview.R
import com.tunc.recyclerview.base.BaseModel
import com.tunc.recyclerview.view_holder.PostViewHolder

class PostModel(
    var postId: String? = "1",
    var body: String? = "body body body"
) : BaseModel(PostViewHolder.LAYOUT_ID)