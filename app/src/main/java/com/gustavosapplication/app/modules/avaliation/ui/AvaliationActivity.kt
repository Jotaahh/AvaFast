package com.gustavosapplication.app.modules.avaliation.ui

import androidx.activity.viewModels
import com.gustavosapplication.app.R
import com.gustavosapplication.app.appcomponents.base.BaseActivity
import com.gustavosapplication.app.databinding.ActivityAvaliationBinding
import com.gustavosapplication.app.modules.avaliation.`data`.viewmodel.AvaliationVM
import com.gustavosapplication.app.modules.home.ui.HomeActivity
import kotlin.String
import kotlin.Unit

class AvaliationActivity : BaseActivity<ActivityAvaliationBinding>(R.layout.activity_avaliation) {
  private val viewModel: AvaliationVM by viewModels<AvaliationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.avaliationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnProximo.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnVoltar.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "AVALIATION_ACTIVITY"

  }
}
