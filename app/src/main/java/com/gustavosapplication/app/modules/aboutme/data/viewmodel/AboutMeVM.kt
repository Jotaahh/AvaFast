package com.gustavosapplication.app.modules.aboutme.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gustavosapplication.app.modules.aboutme.`data`.model.AboutMeModel
import org.koin.core.KoinComponent

class AboutMeVM : ViewModel(), KoinComponent {
  val aboutMeModel: MutableLiveData<AboutMeModel> = MutableLiveData(AboutMeModel())

  var navArguments: Bundle? = null
}
