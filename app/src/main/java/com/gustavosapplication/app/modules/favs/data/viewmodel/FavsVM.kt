package com.gustavosapplication.app.modules.favs.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gustavosapplication.app.modules.favs.`data`.model.FavsModel
import org.koin.core.KoinComponent

class FavsVM : ViewModel(), KoinComponent {
  val favsModel: MutableLiveData<FavsModel> = MutableLiveData(FavsModel())

  var navArguments: Bundle? = null
}
