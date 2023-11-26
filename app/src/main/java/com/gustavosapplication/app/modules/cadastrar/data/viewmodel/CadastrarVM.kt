package com.gustavosapplication.app.modules.cadastrar.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.gustavosapplication.app.modules.cadastrar.`data`.model.CadastrarModel
import org.koin.core.KoinComponent

class CadastrarVM : ViewModel(), KoinComponent {
  val cadastrarModel: MutableLiveData<CadastrarModel> = MutableLiveData(CadastrarModel())


  var navArguments: Bundle? = null


  lateinit var googleAuthResponse: GoogleSignInAccount
}
