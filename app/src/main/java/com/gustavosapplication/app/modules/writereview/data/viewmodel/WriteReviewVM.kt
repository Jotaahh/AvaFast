package com.gustavosapplication.app.modules.writereview.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gustavosapplication.app.modules.writereview.`data`.model.WriteReviewModel
import org.koin.core.KoinComponent

class WriteReviewVM : ViewModel(), KoinComponent {
  val writeReviewModel: MutableLiveData<WriteReviewModel> = MutableLiveData(WriteReviewModel())

  var navArguments: Bundle? = null
}
