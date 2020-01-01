package com.tunc.recyclerview.utils

import androidx.annotation.DrawableRes
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

@JvmOverloads
fun <A : RecyclerView.Adapter<*>> A.vertical(
    recyclerView: RecyclerView,
    layoutManager: RecyclerView.LayoutManager? = null,
    @DrawableRes separatorDrawable: Int? = null
): A {
    recyclerView.run {
        this.layoutManager = layoutManager ?: LinearLayoutManager(context)
        adapter = this@vertical
        separatorDrawable?.let {
            addItemDecoration(
                DividerItemDecoration(context, DividerItemDecoration.VERTICAL).apply {
                    setDrawable(
                        ContextCompat.getDrawable(context, it)!!
                    )
                }
            )
        }
    }
    return this
}

@JvmOverloads
fun <A : RecyclerView.Adapter<*>> A.horizantal(
    recyclerView: RecyclerView,
    layoutManager: RecyclerView.LayoutManager? = null,
    @DrawableRes separatorDrawable: Int? = null
): A {
    recyclerView.run {
        this.layoutManager =
            layoutManager ?: LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        adapter = this@horizantal
        separatorDrawable?.let {
            addItemDecoration(
                DividerItemDecoration(context, LinearLayoutManager.HORIZONTAL).apply {
                    setDrawable(
                        ContextCompat.getDrawable(context, it)!!
                    )
                }
            )
        }
    }
    return this
}


@JvmOverloads
fun <A : RecyclerView.Adapter<*>> A.onInitGrid(
    recyclerView: RecyclerView,
    layoutManager: RecyclerView.LayoutManager? = null,
    column: Int? = 2,
    @DrawableRes separatorDrawable: Int? = null
): A {
    recyclerView.run {
        this.layoutManager = layoutManager ?: GridLayoutManager(context, column!!)
        adapter = this@onInitGrid
        separatorDrawable?.let {
            addItemDecoration(
                DividerItemDecoration(context, DividerItemDecoration.VERTICAL).apply {
                    setDrawable(
                        ContextCompat.getDrawable(context, it)!!
                    )
                }
            )
        }
    }
    return this
}

