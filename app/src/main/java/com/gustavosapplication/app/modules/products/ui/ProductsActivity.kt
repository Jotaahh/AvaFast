package com.gustavosapplication.app.modules.products.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.gustavosapplication.app.R
import com.gustavosapplication.app.appcomponents.base.BaseActivity
import com.gustavosapplication.app.databinding.ActivityProductsBinding
import com.gustavosapplication.app.modules.home.ui.HomeActivity
import com.gustavosapplication.app.modules.productdetail.ui.ProductDetailActivity
import com.gustavosapplication.app.modules.products.`data`.viewmodel.ProductsVM
import kotlin.String
import kotlin.Unit

class ProductsActivity : BaseActivity<ActivityProductsBinding>(R.layout.activity_products) {
  private val viewModel: ProductsVM by viewModels<ProductsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.productsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowright.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnvectorThree.setOnClickListener {
      val destIntent = ProductDetailActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "PRODUCTS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ProductsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
