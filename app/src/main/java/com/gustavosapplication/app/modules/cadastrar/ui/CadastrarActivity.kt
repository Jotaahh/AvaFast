package com.gustavosapplication.app.modules.cadastrar.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.gustavosapplication.app.R
import com.gustavosapplication.app.appcomponents.base.BaseActivity
import com.gustavosapplication.app.appcomponents.googleauth.GoogleHelper
import com.gustavosapplication.app.databinding.ActivityCadastrarBinding
import com.gustavosapplication.app.modules.cadastrar.`data`.viewmodel.CadastrarVM
import com.gustavosapplication.app.modules.home.ui.HomeActivity
import com.gustavosapplication.app.modules.login.ui.LoginActivity
import kotlin.String
import kotlin.Unit

class CadastrarActivity : BaseActivity<ActivityCadastrarBinding>(R.layout.activity_cadastrar) {
  private val viewModel: CadastrarVM by viewModels<CadastrarVM>()

  private lateinit var googleLogin: GoogleHelper

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.cadastrarVM = viewModel
    googleLogin = GoogleHelper(this,
    { accountInfo ->
      },{ error -> 

      })
    }

    override fun setUpClicks(): Unit {
      binding.btnCriarConta.setOnClickListener {
        val destIntent = HomeActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      binding.linearRowgroupfour.setOnClickListener {
        googleLogin.login()
      }
      binding.btnJTemLogin.setOnClickListener {
        val destIntent = HomeActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      binding.txtJtemcontaL.setOnClickListener {
        val destIntent = LoginActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      binding.linearPrimaryButton.setOnClickListener {
        val destIntent = HomeActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "CADASTRAR_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, CadastrarActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
