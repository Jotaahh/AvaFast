package com.gustavosapplication.app.modules.productdetail.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gustavosapplication.app.modules.productdetail.`data`.model.ProductDetailModel
import org.koin.core.KoinComponent

class ProductDetailVM : ViewModel(), KoinComponent {
  val productDetailModel: MutableLiveData<ProductDetailModel> =
      MutableLiveData(ProductDetailModel())

  var navArguments: Bundle? = null
}
