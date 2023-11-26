package com.gustavosapplication.app.modules.avaliaes.`data`.model

import com.gustavosapplication.app.R
import com.gustavosapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AvaliaEsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRestaurantes: String? = MyApp.getInstance().resources.getString(R.string.msg_minhas_avalia)

)
