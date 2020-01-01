package com.tunc.recyclerview.model

import com.tunc.recyclerview.base.BaseModel
import com.tunc.recyclerview.utils.PostEnums
import com.tunc.recyclerview.view_holder.PostViewHolder

class PostModel(
    var title: String? = "",
    var postList: List<BaseModel>? = emptyList(),
    var type: PostEnums? = PostEnums.NORMAL_POST
) : BaseModel(PostViewHolder.LAYOUT_ID)