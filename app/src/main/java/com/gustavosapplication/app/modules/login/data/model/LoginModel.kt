package com.gustavosapplication.app.modules.login.`data`.model

import com.gustavosapplication.app.R
import com.gustavosapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LoginModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBemVindo: String? = MyApp.getInstance().resources.getString(R.string.lbl_bem_vindo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcomeback: String? = MyApp.getInstance().resources.getString(R.string.lbl_welcome_back)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEntrenasuaco: String? =
      MyApp.getInstance().resources.getString(R.string.msg_entre_na_sua_co)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEndereodeema: String? =
      MyApp.getInstance().resources.getString(R.string.msg_endere_o_de_ema)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLembrarSempre: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_lembrar_sempre)

)
