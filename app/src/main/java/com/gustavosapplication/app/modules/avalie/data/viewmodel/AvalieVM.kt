package com.gustavosapplication.app.modules.avalie.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gustavosapplication.app.modules.avalie.`data`.model.AvalieModel
import org.koin.core.KoinComponent

class AvalieVM : ViewModel(), KoinComponent {
  val avalieModel: MutableLiveData<AvalieModel> = MutableLiveData(AvalieModel())

  var navArguments: Bundle? = null
}
