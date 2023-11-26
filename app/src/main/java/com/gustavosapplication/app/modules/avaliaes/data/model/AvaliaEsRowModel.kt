package com.gustavosapplication.app.modules.avaliaes.`data`.model

import com.gustavosapplication.app.R
import com.gustavosapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AvaliaEsRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNomeRestaurant: String? = MyApp.getInstance().resources.getString(R.string.lbl_coco_bambu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFocodorest: String? = MyApp.getInstance().resources.getString(R.string.lbl_frutos_do_mar)

)
