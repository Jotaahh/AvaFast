package com.gustavosapplication.app.modules.avaliaes.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gustavosapplication.app.R
import com.gustavosapplication.app.databinding.RowAvaliaEsBinding
import com.gustavosapplication.app.modules.avaliaes.`data`.model.AvaliaEsRowModel
import kotlin.Int
import kotlin.collections.List

class AvaliaesAdapter(
  var list: List<AvaliaEsRowModel>
) : RecyclerView.Adapter<AvaliaesAdapter.RowAvaliaEsVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowAvaliaEsVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_avalia_es,parent,false)
    return RowAvaliaEsVH(view)
  }

  override fun onBindViewHolder(holder: RowAvaliaEsVH, position: Int) {
    val avaliaEsRowModel = AvaliaEsRowModel()
    // TODO uncomment following line after integration with data source
    // val avaliaEsRowModel = list[position]
    holder.binding.avaliaEsRowModel = avaliaEsRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<AvaliaEsRowModel>) {
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
      item: AvaliaEsRowModel
    ) {
    }
  }

  inner class RowAvaliaEsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowAvaliaEsBinding = RowAvaliaEsBinding.bind(itemView)
  }
}
