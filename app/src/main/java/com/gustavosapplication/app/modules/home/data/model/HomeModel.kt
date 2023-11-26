package com.gustavosapplication.app.modules.home.`data`.model

import com.gustavosapplication.app.R
import com.gustavosapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCategories: String? = MyApp.getInstance().resources.getString(R.string.lbl_categories)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVegetariano: String? = MyApp.getInstance().resources.getString(R.string.lbl_vegetariano)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrutosdoM: String? = MyApp.getInstance().resources.getString(R.string.lbl_frutos_do_m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtComidaJap: String? = MyApp.getInstance().resources.getString(R.string.lbl_comida_jap)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFastFood: String? = MyApp.getInstance().resources.getString(R.string.lbl_fast_food)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtComidaBras: String? = MyApp.getInstance().resources.getString(R.string.lbl_comida_bras)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtComidaMex: String? = MyApp.getInstance().resources.getString(R.string.lbl_comida_mex)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRestaurantesme: String? =
      MyApp.getInstance().resources.getString(R.string.msg_restaurantes_me)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCocoBambu: String? = MyApp.getInstance().resources.getString(R.string.lbl_coco_bambu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrutosdoMar: String? = MyApp.getInstance().resources.getString(R.string.lbl_frutos_do_mar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt87avaliaes: String? = MyApp.getInstance().resources.getString(R.string.lbl_87_avalia_es)
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
  var txtAvaFast: String? = MyApp.getInstance().resources.getString(R.string.lbl_avafast)

)
