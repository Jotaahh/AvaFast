package com.gustavosapplication.app.modules.products.`data`.model

import com.gustavosapplication.app.R
import com.gustavosapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ProductsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRestaurantes: String? = MyApp.getInstance().resources.getString(R.string.lbl_restaurantes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCocoBambu: String? = MyApp.getInstance().resources.getString(R.string.lbl_nau)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrutosdoMar: String? = MyApp.getInstance().resources.getString(R.string.lbl_frutos_do_mar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt87avaliaes: String? = MyApp.getInstance().resources.getString(R.string.lbl_62_avalia_es)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCocoBambuOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_coco_bambu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrutosdoMarOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_frutos_do_mar2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt87avaliaesOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_87_avalia_es)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtComidaBrasilei: String? =
      MyApp.getInstance().resources.getString(R.string.msg_comida_brasilei)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMangai: String? = MyApp.getInstance().resources.getString(R.string.lbl_mangai)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt54avaliaes: String? = MyApp.getInstance().resources.getString(R.string.lbl_54_avalia_es)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLbsCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_5_0_lbs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCocoBambuTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_black_grapes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt87avaliaesTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_87_avalia_es)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOnsale: String? = MyApp.getInstance().resources.getString(R.string.lbl_16)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCocoBambuThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_nazo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrutosdoMarTwo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_comida_japonesa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt87avaliaesThree: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_50_avalia_es)

)
