package com.gustavosapplication.app.modules.favs.`data`.model

import com.gustavosapplication.app.R
import com.gustavosapplication.app.appcomponents.di.MyApp
import kotlin.String

data class FavsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMeusFavoritos: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_meus_favoritos2)
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

)
