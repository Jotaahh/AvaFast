package com.gustavosapplication.app.modules.aboutme.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.gustavosapplication.app.R
import com.gustavosapplication.app.appcomponents.base.BaseActivity
import com.gustavosapplication.app.databinding.ActivityAboutMeBinding
import com.gustavosapplication.app.modules.aboutme.`data`.viewmodel.AboutMeVM
import com.gustavosapplication.app.modules.account.ui.AccountActivity
import com.gustavosapplication.app.modules.home.ui.HomeActivity
import kotlin.String
import kotlin.Unit

class AboutMeActivity : BaseActivity<ActivityAboutMeBinding>(R.layout.activity_about_me) {
  private val viewModel: AboutMeVM by viewModels<AboutMeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.aboutMeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowright.setOnClickListener {
      val destIntent = AccountActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnProximo.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ABOUT_ME_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AboutMeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
