package com.gustavosapplication.app.modules.avalie.ui

import androidx.activity.viewModels
import com.gustavosapplication.app.R
import com.gustavosapplication.app.appcomponents.base.BaseActivity
import com.gustavosapplication.app.databinding.ActivityAvalieBinding
import com.gustavosapplication.app.modules.avalie.`data`.viewmodel.AvalieVM
import com.gustavosapplication.app.modules.home.ui.HomeActivity
import kotlin.String
import kotlin.Unit

class AvalieActivity : BaseActivity<ActivityAvalieBinding>(R.layout.activity_avalie) {
  private val viewModel: AvalieVM by viewModels<AvalieVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.avalieVM = viewModel
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
    const val TAG: String = "AVALIE_ACTIVITY"

  }
}
