package com.gustavosapplication.app.modules.category.`data`.model

import com.gustavosapplication.app.R
import com.gustavosapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CategoryModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCategorias: String? = MyApp.getInstance().resources.getString(R.string.lbl_categorias)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVegetariano: String? = MyApp.getInstance().resources.getString(R.string.lbl_vegetariano)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrutosdoMar: String? = MyApp.getInstance().resources.getString(R.string.lbl_frutos_do_mar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtComidaJaponesa: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_comida_japonesa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFastFood: String? = MyApp.getInstance().resources.getString(R.string.lbl_fast_food)
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
  var txtComidaMexicana: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_comida_mexicana)

)
