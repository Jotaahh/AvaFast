package com.gustavosapplication.app.modules.comofunciona.ui

import androidx.activity.viewModels
import com.gustavosapplication.app.R
import com.gustavosapplication.app.appcomponents.base.BaseActivity
import com.gustavosapplication.app.databinding.ActivityComoFuncionaBinding
import com.gustavosapplication.app.modules.comofunciona.`data`.viewmodel.ComoFuncionaVM
import com.gustavosapplication.app.modules.home.ui.HomeActivity
import kotlin.String
import kotlin.Unit

class ComoFuncionaActivity :
    BaseActivity<ActivityComoFuncionaBinding>(R.layout.activity_como_funciona) {
  private val viewModel: ComoFuncionaVM by viewModels<ComoFuncionaVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.comoFuncionaVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnVoltar.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnProximo.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "COMO_FUNCIONA_ACTIVITY"

  }
}
