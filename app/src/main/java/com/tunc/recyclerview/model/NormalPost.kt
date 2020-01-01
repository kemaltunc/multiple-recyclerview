package com.tunc.recyclerview.model

import com.tunc.recyclerview.base.BaseModel
import com.tunc.recyclerview.view_holder.NormalPostViewHolder

class NormalPost(
    var postId: String? = "",
    var imageUrl: String? = "",
    var body: String? = ""
) : BaseModel(NormalPostViewHolder.LAYOUT_ID)