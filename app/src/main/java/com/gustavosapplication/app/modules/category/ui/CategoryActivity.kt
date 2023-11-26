package com.gustavosapplication.app.modules.category.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.gustavosapplication.app.R
import com.gustavosapplication.app.appcomponents.base.BaseActivity
import com.gustavosapplication.app.databinding.ActivityCategoryBinding
import com.gustavosapplication.app.modules.category.`data`.viewmodel.CategoryVM
import com.gustavosapplication.app.modules.home.ui.HomeActivity
import kotlin.String
import kotlin.Unit

class CategoryActivity : BaseActivity<ActivityCategoryBinding>(R.layout.activity_category) {
  private val viewModel: CategoryVM by viewModels<CategoryVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.categoryVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowright.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CATEGORY_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CategoryActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
