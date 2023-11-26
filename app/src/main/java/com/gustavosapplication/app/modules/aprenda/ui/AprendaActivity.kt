package com.gustavosapplication.app.modules.aprenda.ui

import androidx.activity.viewModels
import com.gustavosapplication.app.R
import com.gustavosapplication.app.appcomponents.base.BaseActivity
import com.gustavosapplication.app.databinding.ActivityAprendaBinding
import com.gustavosapplication.app.modules.aprenda.`data`.viewmodel.AprendaVM
import com.gustavosapplication.app.modules.home.ui.HomeActivity
import kotlin.String
import kotlin.Unit

class AprendaActivity : BaseActivity<ActivityAprendaBinding>(R.layout.activity_aprenda) {
  private val viewModel: AprendaVM by viewModels<AprendaVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.aprendaVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnProximo.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "APRENDA_ACTIVITY"

  }
}
