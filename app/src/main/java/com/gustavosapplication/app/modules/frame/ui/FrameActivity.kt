package com.gustavosapplication.app.modules.frame.ui

import androidx.activity.viewModels
import com.gustavosapplication.app.R
import com.gustavosapplication.app.appcomponents.base.BaseActivity
import com.gustavosapplication.app.databinding.ActivityFrameBinding
import com.gustavosapplication.app.modules.frame.`data`.viewmodel.FrameVM
import kotlin.String
import kotlin.Unit

class FrameActivity : BaseActivity<ActivityFrameBinding>(R.layout.activity_frame) {
  private val viewModel: FrameVM by viewModels<FrameVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.frameVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "FRAME_ACTIVITY"

  }
}
