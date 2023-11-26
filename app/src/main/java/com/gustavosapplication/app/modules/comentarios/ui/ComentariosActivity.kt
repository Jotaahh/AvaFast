package com.gustavosapplication.app.modules.comentarios.ui

import android.view.View
import androidx.activity.viewModels
import com.gustavosapplication.app.R
import com.gustavosapplication.app.appcomponents.base.BaseActivity
import com.gustavosapplication.app.databinding.ActivityComentariosBinding
import com.gustavosapplication.app.modules.comentarios.`data`.model.ComentariosRowModel
import com.gustavosapplication.app.modules.comentarios.`data`.viewmodel.ComentariosVM
import com.gustavosapplication.app.modules.productdetail.ui.ProductDetailActivity
import com.gustavosapplication.app.modules.writereview.ui.WriteReviewActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ComentariosActivity : BaseActivity<ActivityComentariosBinding>(R.layout.activity_comentarios)
    {
  private val viewModel: ComentariosVM by viewModels<ComentariosVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val comentariosAdapter =
    ComentariosAdapter(viewModel.comentariosList.value?:mutableListOf())
    binding.recyclerComentarios.adapter = comentariosAdapter
    comentariosAdapter.setOnItemClickListener(
    object : ComentariosAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ComentariosRowModel) {
        onClickRecyclerComentarios(view, position, item)
      }
    }
    )
    viewModel.comentariosList.observe(this) {
      comentariosAdapter.updateData(it)
    }
    binding.comentariosVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowright.setOnClickListener {
      val destIntent = ProductDetailActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageAddOne.setOnClickListener {
      val destIntent = WriteReviewActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerComentarios(
    view: View,
    position: Int,
    item: ComentariosRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "COMENTARIOS_ACTIVITY"

  }
}
