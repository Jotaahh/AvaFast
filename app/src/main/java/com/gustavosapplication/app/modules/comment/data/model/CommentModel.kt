package com.gustavosapplication.app.modules.comment.`data`.model

import com.gustavosapplication.app.R
import com.gustavosapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CommentModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAvaliaesprv: String? = MyApp.getInstance().resources.getString(R.string.msg_avalia_es_pr_v)

)
