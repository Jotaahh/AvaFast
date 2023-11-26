package com.gustavosapplication.app.modules.comofunciona.`data`.model

import com.gustavosapplication.app.R
import com.gustavosapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ComoFuncionaModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAvaFast: String? = MyApp.getInstance().resources.getString(R.string.lbl_avafast)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtComoFuncionamo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_como_funcionamo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOintuirodono: String? =
      MyApp.getInstance().resources.getString(R.string.msg_o_intuiro_do_no)

)
