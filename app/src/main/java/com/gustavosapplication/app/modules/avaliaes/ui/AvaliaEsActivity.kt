package com.gustavosapplication.app.modules.avaliaes.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.gustavosapplication.app.R
import com.gustavosapplication.app.appcomponents.base.BaseActivity
import com.gustavosapplication.app.databinding.ActivityAvaliaEsBinding
import com.gustavosapplication.app.modules.avaliaes.`data`.model.AvaliaEsRowModel
import com.gustavosapplication.app.modules.avaliaes.`data`.viewmodel.AvaliaEsVM
import com.gustavosapplication.app.modules.home.ui.HomeActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class AvaliaEsActivity : BaseActivity<ActivityAvaliaEsBinding>(R.layout.activity_avalia_es) {
  private val viewModel: AvaliaEsVM by viewModels<AvaliaEsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val avaliaesAdapter = AvaliaesAdapter(viewModel.avaliaesList.value?:mutableListOf())
    binding.recyclerAvaliaes.adapter = avaliaesAdapter
    avaliaesAdapter.setOnItemClickListener(
    object : AvaliaesAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : AvaliaEsRowModel) {
        onClickRecyclerAvaliaes(view, position, item)
      }
    }
    )
    viewModel.avaliaesList.observe(this) {
      avaliaesAdapter.updateData(it)
    }
    binding.avaliaEsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowright.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerAvaliaes(
    view: View,
    position: Int,
    item: AvaliaEsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "AVALIA_ES_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AvaliaEsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
