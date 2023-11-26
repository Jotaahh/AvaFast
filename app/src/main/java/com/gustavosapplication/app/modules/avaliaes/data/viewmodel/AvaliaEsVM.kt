package com.gustavosapplication.app.modules.avaliaes.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gustavosapplication.app.modules.avaliaes.`data`.model.AvaliaEsModel
import com.gustavosapplication.app.modules.avaliaes.`data`.model.AvaliaEsRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class AvaliaEsVM : ViewModel(), KoinComponent {
  val avaliaEsModel: MutableLiveData<AvaliaEsModel> = MutableLiveData(AvaliaEsModel())

  var navArguments: Bundle? = null

  val avaliaesList: MutableLiveData<MutableList<AvaliaEsRowModel>> =
      MutableLiveData(mutableListOf())
}
