package com.gustavosapplication.app.modules.productdetail.`data`.model

import com.gustavosapplication.app.R
import com.gustavosapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ProductDetailModel(
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
  var txtFortyFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt89reviews: String? = MyApp.getInstance().resources.getString(R.string.lbl_89_reviews)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_considerado_o_m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAdicionarAvali: String? =
      MyApp.getInstance().resources.getString(R.string.msg_adicionar_avali)

)
