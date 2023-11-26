package com.gustavosapplication.app.modules.comentariosss.ui

import android.view.View
import androidx.activity.viewModels
import com.gustavosapplication.app.R
import com.gustavosapplication.app.appcomponents.base.BaseActivity
import com.gustavosapplication.app.databinding.ActivityComentariosssBinding
import com.gustavosapplication.app.modules.comentariosss.`data`.model.ComentariosssRowModel
import com.gustavosapplication.app.modules.comentariosss.`data`.viewmodel.ComentariosssVM
import com.gustavosapplication.app.modules.productdetail.ui.ProductDetailActivity
import com.gustavosapplication.app.modules.writereview.ui.WriteReviewActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ComentariosssActivity :
    BaseActivity<ActivityComentariosssBinding>(R.layout.activity_comentariosss) {
  private val viewModel: ComentariosssVM by viewModels<ComentariosssVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val comentariosssAdapter =
    ComentariosssAdapter(viewModel.comentariosssList.value?:mutableListOf())
    binding.recyclerComentariosss.adapter = comentariosssAdapter
    comentariosssAdapter.setOnItemClickListener(
    object : ComentariosssAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ComentariosssRowModel) {
        onClickRecyclerComentariosss(view, position, item)
      }
    }
    )
    viewModel.comentariosssList.observe(this) {
      comentariosssAdapter.updateData(it)
    }
    binding.comentariosssVM = viewModel
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

  fun onClickRecyclerComentariosss(
    view: View,
    position: Int,
    item: ComentariosssRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "COMENTARIOSSS_ACTIVITY"

  }
}
