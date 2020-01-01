package com.tunc.recyclerview.model

import com.tunc.recyclerview.R
import com.tunc.recyclerview.base.BaseModel
import com.tunc.recyclerview.view_holder.UserViewHolder

class UserModel(
    var name: String? = "Kemal",
    var surname: String? = "Tunç"
) : BaseModel(UserViewHolder.LAYOUT_ID)