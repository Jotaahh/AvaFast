package com.gustavosapplication.app.modules.comentariosss.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gustavosapplication.app.R
import com.gustavosapplication.app.databinding.RowComentariosssBinding
import com.gustavosapplication.app.modules.comentariosss.`data`.model.ComentariosssRowModel
import kotlin.Int
import kotlin.collections.List

class ComentariosssAdapter(
  var list: List<ComentariosssRowModel>
) : RecyclerView.Adapter<ComentariosssAdapter.RowComentariosssVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowComentariosssVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_comentariosss,parent,false)
    return RowComentariosssVH(view)
  }

  override fun onBindViewHolder(holder: RowComentariosssVH, position: Int) {
    val comentariosssRowModel = ComentariosssRowModel()
    // TODO uncomment following line after integration with data source
    // val comentariosssRowModel = list[position]
    holder.binding.comentariosssRowModel = comentariosssRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ComentariosssRowModel>) {
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
      item: ComentariosssRowModel
    ) {
    }
  }

  inner class RowComentariosssVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowComentariosssBinding = RowComentariosssBinding.bind(itemView)
  }
}
