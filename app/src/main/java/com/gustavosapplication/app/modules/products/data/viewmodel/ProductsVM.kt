package com.gustavosapplication.app.modules.products.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gustavosapplication.app.modules.products.`data`.model.ProductsModel
import org.koin.core.KoinComponent

class ProductsVM : ViewModel(), KoinComponent {
  val productsModel: MutableLiveData<ProductsModel> = MutableLiveData(ProductsModel())

  var navArguments: Bundle? = null
}
