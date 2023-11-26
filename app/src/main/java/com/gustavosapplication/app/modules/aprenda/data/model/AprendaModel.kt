package com.gustavosapplication.app.modules.aprenda.`data`.model

import com.gustavosapplication.app.R
import com.gustavosapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AprendaModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAvaFast: String? = MyApp.getInstance().resources.getString(R.string.lbl_avafast)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAprendaamexer: String? =
      MyApp.getInstance().resources.getString(R.string.msg_aprenda_a_mexer)

)
