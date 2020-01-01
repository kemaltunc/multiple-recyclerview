package com.tunc.recyclerview.extensions

import androidx.annotation.DrawableRes
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

@JvmOverloads
fun <A : RecyclerView.Adapter<*>> A.onInit(
    recyclerView: RecyclerView,
    layoutManager: RecyclerView.LayoutManager? = null,
    dividerItemDecoration: Int? = DividerItemDecoration.VERTICAL,
    @DrawableRes separatorDrawable: Int? = null
): A {
    recyclerView.run {
        this.layoutManager = layoutManager ?: LinearLayoutManager(context)
        adapter = this@onInit
        separatorDrawable?.let {
            addItemDecoration(
                DividerItemDecoration(context, dividerItemDecoration!!).apply {
                    setDrawable(
                        ContextCompat.getDrawable(context, it)!!
                    )
                }
            )
        }
    }
    return this
}
