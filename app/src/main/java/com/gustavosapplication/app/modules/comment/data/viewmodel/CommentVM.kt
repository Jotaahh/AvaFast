package com.gustavosapplication.app.modules.comment.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gustavosapplication.app.modules.comment.`data`.model.CommentModel
import com.gustavosapplication.app.modules.comment.`data`.model.CommentRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CommentVM : ViewModel(), KoinComponent {
  val commentModel: MutableLiveData<CommentModel> = MutableLiveData(CommentModel())

  var navArguments: Bundle? = null

  val commentList: MutableLiveData<MutableList<CommentRowModel>> = MutableLiveData(mutableListOf())
}
