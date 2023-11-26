package com.gustavosapplication.app.modules.verifynumber.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.gustavosapplication.app.R
import com.gustavosapplication.app.appcomponents.base.BaseActivity
import com.gustavosapplication.app.databinding.ActivityVerifyNumberBinding
import com.gustavosapplication.app.modules.cadastrar.ui.CadastrarActivity
import com.gustavosapplication.app.modules.otpscreen.ui.OtpScreenActivity
import com.gustavosapplication.app.modules.verifynumber.`data`.viewmodel.VerifyNumberVM
import kotlin.String
import kotlin.Unit

class VerifyNumberActivity :
    BaseActivity<ActivityVerifyNumberBinding>(R.layout.activity_verify_number) {
  private val viewModel: VerifyNumberVM by viewModels<VerifyNumberVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.verifyNumberVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowright.setOnClickListener {
      val destIntent = CadastrarActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnProximo.setOnClickListener {
      val destIntent = OtpScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "VERIFY_NUMBER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, VerifyNumberActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
