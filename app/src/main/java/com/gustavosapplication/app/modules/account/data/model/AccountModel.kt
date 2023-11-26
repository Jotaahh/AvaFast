package com.gustavosapplication.app.modules.account.`data`.model

import com.gustavosapplication.app.R
import com.gustavosapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AccountModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNeymarJr: String? = MyApp.getInstance().resources.getString(R.string.lbl_neymar_junior)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSobremim: String? = MyApp.getInstance().resources.getString(R.string.lbl_sobre_mim)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMeusfavoritos: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_meus_favoritos)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEndereo: String? = MyApp.getInstance().resources.getString(R.string.lbl_endere_o)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSairdaconta: String? = MyApp.getInstance().resources.getString(R.string.lbl_sair_da_conta)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAvaFast: String? = MyApp.getInstance().resources.getString(R.string.lbl_avafast)

)
