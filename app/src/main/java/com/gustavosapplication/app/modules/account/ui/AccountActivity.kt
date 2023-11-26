package com.gustavosapplication.app.modules.account.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.gustavosapplication.app.R
import com.gustavosapplication.app.appcomponents.base.BaseActivity
import com.gustavosapplication.app.databinding.ActivityAccountBinding
import com.gustavosapplication.app.modules.aboutme.ui.AboutMeActivity
import com.gustavosapplication.app.modules.account.`data`.viewmodel.AccountVM
import com.gustavosapplication.app.modules.avaliaes.ui.AvaliaEsActivity
import kotlin.String
import kotlin.Unit

class AccountActivity : BaseActivity<ActivityAccountBinding>(R.layout.activity_account) {
  private val viewModel: AccountVM by viewModels<AccountVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.accountVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearAboutMe.setOnClickListener {
      val destIntent = AboutMeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearMyFav.setOnClickListener {
      val destIntent = AvaliaEsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ACCOUNT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AccountActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
