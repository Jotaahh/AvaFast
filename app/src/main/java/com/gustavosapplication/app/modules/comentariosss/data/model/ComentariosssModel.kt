package com.gustavosapplication.app.modules.comentariosss.`data`.model

import com.gustavosapplication.app.R
import com.gustavosapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ComentariosssModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAvaliaesdos: String? = MyApp.getInstance().resources.getString(R.string.msg_avalia_es_dos)

)
