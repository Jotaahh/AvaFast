package com.gustavosapplication.app.modules.comment.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gustavosapplication.app.R
import com.gustavosapplication.app.databinding.RowCommentBinding
import com.gustavosapplication.app.modules.comment.`data`.model.CommentRowModel
import kotlin.Int
import kotlin.collections.List

class CommentAdapter(
  var list: List<CommentRowModel>
) : RecyclerView.Adapter<CommentAdapter.RowCommentVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowCommentVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_comment,parent,false)
    return RowCommentVH(view)
  }

  override fun onBindViewHolder(holder: RowCommentVH, position: Int) {
    val commentRowModel = CommentRowModel()
    // TODO uncomment following line after integration with data source
    // val commentRowModel = list[position]
    holder.binding.commentRowModel = commentRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<CommentRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: CommentRowModel
    ) {
    }
  }

  inner class RowCommentVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowCommentBinding = RowCommentBinding.bind(itemView)
  }
}
