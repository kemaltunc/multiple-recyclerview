package com.tunc.recyclerview.model

import com.tunc.recyclerview.R
import com.tunc.recyclerview.base.BaseModel

class PostModel(
    var postId: String? = "1",
    var body: String? = "body body body"
) : BaseModel(R.layout.cell_post_item)