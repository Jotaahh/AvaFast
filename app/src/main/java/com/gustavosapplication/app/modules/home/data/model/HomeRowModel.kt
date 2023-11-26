package com.gustavosapplication.app.modules.home.`data`.model

import com.gustavosapplication.app.R
import com.gustavosapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomeRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCocoBambuOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_nau)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrutosdoMarOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_frutos_do_mar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt87avaliaesOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_62_avalia_es)

)
