package com.gustavosapplication.app.modules.comentariosss.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gustavosapplication.app.modules.comentariosss.`data`.model.ComentariosssModel
import com.gustavosapplication.app.modules.comentariosss.`data`.model.ComentariosssRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ComentariosssVM : ViewModel(), KoinComponent {
  val comentariosssModel: MutableLiveData<ComentariosssModel> =
      MutableLiveData(ComentariosssModel())

  var navArguments: Bundle? = null

  val comentariosssList: MutableLiveData<MutableList<ComentariosssRowModel>> =
      MutableLiveData(mutableListOf())
}
