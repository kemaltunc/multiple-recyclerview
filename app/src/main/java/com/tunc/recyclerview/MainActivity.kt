package com.tunc.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tunc.recyclerview.adapter.MainAdapter
import com.tunc.recyclerview.base.BaseModel
import com.tunc.recyclerview.extensions.onInit
import com.tunc.recyclerview.model.MainInterface
import com.tunc.recyclerview.model.PostModel
import com.tunc.recyclerview.model.UserModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainInterface {

    private val postAdapter by lazy { MainAdapter(this) }


    var items: ArrayList<BaseModel> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        postAdapter.onInit(
            recylerview_list
        )

        items = arrayListOf(
            PostModel("1", "deneme"),

            UserModel("kemal", "tunç"),

            PostModel("2", "ikinc ideneme"),

            //Default verdiğimiz layoutu böyle değiştirebiliyoruz.
            UserModel("basefy", "basefy").apply {
                layoutId = R.layout.cell_user_item
            },

            PostModel("3", "ucundu deneme")
        )

        postAdapter.items = items

    }

    override fun remove(position: Int) {
        items.removeAt(position)
        postAdapter.items = items
        postAdapter.notifyDataSetChanged()
    }
}
