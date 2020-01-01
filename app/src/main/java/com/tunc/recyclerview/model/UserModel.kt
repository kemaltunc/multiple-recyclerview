package com.tunc.recyclerview.model

import com.tunc.recyclerview.R
import com.tunc.recyclerview.base.BaseModel

class UserModel(
    var name: String? = "Kemal",
    var surname: String? = "Tunç"
) : BaseModel(R.layout.cell_user_item)