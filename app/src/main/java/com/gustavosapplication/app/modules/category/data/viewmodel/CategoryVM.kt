package com.gustavosapplication.app.modules.category.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gustavosapplication.app.modules.category.`data`.model.CategoryModel
import org.koin.core.KoinComponent

class CategoryVM : ViewModel(), KoinComponent {
  val categoryModel: MutableLiveData<CategoryModel> = MutableLiveData(CategoryModel())

  var navArguments: Bundle? = null
}
