package com.gustavosapplication.app.modules.comentarios.`data`.model

import com.gustavosapplication.app.R
import com.gustavosapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ComentariosModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAvaliaesaute: String? =
      MyApp.getInstance().resources.getString(R.string.msg_avalia_es_aute)

)
