package com.gustavosapplication.app.modules.aboutme.`data`.model

import com.gustavosapplication.app.R
import com.gustavosapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AboutMeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSobremim: String? = MyApp.getInstance().resources.getString(R.string.lbl_sobre_mim)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDetalhesPessoa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_detalhes_pessoa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNeymarDaSilva: String? =
      MyApp.getInstance().resources.getString(R.string.msg_neymar_da_silva)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.msg_neymar_jogador)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_1_202_555_0)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTrocaraSenha: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_trocar_a_senha)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupNineValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupTenValue: String? = null
)
