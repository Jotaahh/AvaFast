package com.gustavosapplication.app.modules.favs.ui

import androidx.activity.viewModels
import com.gustavosapplication.app.R
import com.gustavosapplication.app.appcomponents.base.BaseActivity
import com.gustavosapplication.app.databinding.ActivityFavsBinding
import com.gustavosapplication.app.modules.favs.`data`.viewmodel.FavsVM
import com.gustavosapplication.app.modules.home.ui.HomeActivity
import kotlin.String
import kotlin.Unit

class FavsActivity : BaseActivity<ActivityFavsBinding>(R.layout.activity_favs) {
  private val viewModel: FavsVM by viewModels<FavsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.favsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowright.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FAVS_ACTIVITY"

  }
}
