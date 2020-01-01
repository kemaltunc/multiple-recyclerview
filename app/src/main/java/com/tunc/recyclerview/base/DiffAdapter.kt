package com.tunc.recyclerview.base

import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView

interface DiffAdapter {

    fun <A : RecyclerView.Adapter<*>, M : BaseModel> A.notifyDiff(
        old: List<M>,
        new: List<M>,
        compareItems: (M, M) -> Boolean = { oldItem, newItem ->
            (oldItem.hashCode() == newItem.hashCode())
        },
        compareContents: (M, M) -> Boolean = { oldItem, newItem ->
            (oldItem == newItem)
        },
        changePayLoad: (M, M) -> Any? = { _, _ -> }
    ) {
        val diff = DiffUtil.calculateDiff(
            object : DiffUtil.Callback() {
                override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int) =
                    compareItems(old[oldItemPosition], new[newItemPosition])

                override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int) =
                    compareContents(old[oldItemPosition], new[newItemPosition])

                override fun getChangePayload(oldItemPosition: Int, newItemPosition: Int): Any? =
                    changePayLoad(new[newItemPosition], old[oldItemPosition])

                override fun getOldListSize() = old.size

                override fun getNewListSize() = new.size
            }
        )

        diff.dispatchUpdatesTo(this)
    }

}