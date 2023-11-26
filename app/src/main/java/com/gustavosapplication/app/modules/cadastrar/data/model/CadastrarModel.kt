package com.gustavosapplication.app.modules.cadastrar.`data`.model

import com.gustavosapplication.app.R
import com.gustavosapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CadastrarModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBemVindo: String? = MyApp.getInstance().resources.getString(R.string.lbl_bem_vindo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBemVindoOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_bem_vindo2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFaacadastroe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_fa_a_cadastro_e)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtContinuewithg: String? =
      MyApp.getInstance().resources.getString(R.string.msg_continue_with_g)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_proximo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJtemcontaL: String? = MyApp.getInstance().resources.getString(R.string.msg_j_tem_conta_l)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCreateaccount: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_create_account)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCadastroRpido: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_cadastro_r_pido)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_endere_o_de_em)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNumerodeTelef: String? =
      MyApp.getInstance().resources.getString(R.string.msg_numero_de_telef)

)
