package com.tunc.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tunc.recyclerview.adapter.MainAdapter
import com.tunc.recyclerview.base.BaseModel
import com.tunc.recyclerview.model.MainInterface
import com.tunc.recyclerview.model.NormalPost
import com.tunc.recyclerview.model.PostModel
import com.tunc.recyclerview.model.StoryPost
import com.tunc.recyclerview.utils.PostEnums
import com.tunc.recyclerview.utils.vertical
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainInterface {

    private val homeAdapter by lazy { MainAdapter(this) }

    var homeitems: List<BaseModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        homeAdapter.vertical(
            recylerview_list
        )


        val stories = listOf(
            StoryPost(),
            StoryPost(),
            StoryPost(),
            StoryPost(),
            StoryPost(),
            StoryPost(),
            StoryPost(),
            StoryPost(),
            StoryPost(),
            StoryPost(),
            StoryPost(),
            StoryPost()
        )
        val normalPost = listOf(
            NormalPost(),
            NormalPost(),
            NormalPost(),
            NormalPost(),
            NormalPost()
        )

        homeitems = listOf(
            PostModel(
                "Hikayeler",
                stories,
                PostEnums.STORY_POST
            ),
            PostModel(
                "Postlar",
                normalPost,
                PostEnums.NORMAL_POST
            )
        )

        homeAdapter.items = homeitems!!
    }

    override fun remove(position: Int) {
    }
}
