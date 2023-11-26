package com.gustavosapplication.app.modules.aprenda.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gustavosapplication.app.modules.aprenda.`data`.model.AprendaModel
import org.koin.core.KoinComponent

class AprendaVM : ViewModel(), KoinComponent {
  val aprendaModel: MutableLiveData<AprendaModel> = MutableLiveData(AprendaModel())

  var navArguments: Bundle? = null
}
