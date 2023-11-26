package com.gustavosapplication.app.modules.comment.`data`.model

import com.gustavosapplication.app.R
import com.gustavosapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CommentRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_sabrina)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.lbl_32_minutes_ago)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFortyFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMuitoboaacom: String? =
      MyApp.getInstance().resources.getString(R.string.msg_muito_boa_a_com)

)
