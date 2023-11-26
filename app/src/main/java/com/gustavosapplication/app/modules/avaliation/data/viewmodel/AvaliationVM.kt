package com.gustavosapplication.app.modules.avaliation.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gustavosapplication.app.modules.avaliation.`data`.model.AvaliationModel
import org.koin.core.KoinComponent

class AvaliationVM : ViewModel(), KoinComponent {
  val avaliationModel: MutableLiveData<AvaliationModel> = MutableLiveData(AvaliationModel())

  var navArguments: Bundle? = null
}
