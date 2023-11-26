package com.gustavosapplication.app.modules.home.ui

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.gustavosapplication.app.R
import com.gustavosapplication.app.appcomponents.base.BaseActivity
import com.gustavosapplication.app.databinding.ActivityHomeBinding
import com.gustavosapplication.app.modules.category.ui.CategoryActivity
import com.gustavosapplication.app.modules.home.`data`.model.HomeRowModel
import com.gustavosapplication.app.modules.home.`data`.model.ImageSliderSliderellaolssonrdthreeModel
import com.gustavosapplication.app.modules.home.`data`.viewmodel.HomeVM
import com.gustavosapplication.app.modules.productdetail.ui.ProductDetailActivity
import com.gustavosapplication.app.modules.products.ui.ProductsActivity
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

class HomeActivity : BaseActivity<ActivityHomeBinding>(R.layout.activity_home) {
  private val imageUri: Uri =
      Uri.parse("android.resource://com.gustavosapplication.app/drawable/img_ellaolssonrd3")


  private val imageSliderSliderellaolssonrdthreeItems:
      ArrayList<ImageSliderSliderellaolssonrdthreeModel> =
      arrayListOf(ImageSliderSliderellaolssonrdthreeModel(imageEllaolssonrDThree =
  imageUri.toString()),ImageSliderSliderellaolssonrdthreeModel(imageEllaolssonrDThree =
  imageUri.toString()))


  private val viewModel: HomeVM by viewModels<HomeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val sliderellaolssonrdthreeAdapter =
    SliderellaolssonrdthreeAdapter(imageSliderSliderellaolssonrdthreeItems,true)
    binding.imageSliderSliderellaolssonrdthree.adapter = sliderellaolssonrdthreeAdapter
    binding.imageSliderSliderellaolssonrdthree.onIndicatorProgress = { selectingPosition,
      progress ->
      binding.indicatorGroupTwenty.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorGroupTwenty.updateIndicatorCounts(binding.imageSliderSliderellaolssonrdthree.indicatorCount)
    val homeAdapter = HomeAdapter(viewModel.homeList.value?:mutableListOf())
    binding.recyclerHome.adapter = homeAdapter
    homeAdapter.setOnItemClickListener(
    object : HomeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : HomeRowModel) {
        onClickRecyclerHome(view, position, item)
      }
    }
    )
    viewModel.homeList.observe(this) {
      homeAdapter.updateData(it)
    }
    binding.homeVM = viewModel
    setUpSearchViewSearchBarListener()
  }

  override fun onPause(): Unit {
    binding.imageSliderSliderellaolssonrdthree.pauseAutoScroll()
    super.onPause()
  }

  override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderSliderellaolssonrdthree.resumeAutoScroll()
  }

  override fun setUpClicks(): Unit {
    binding.linearFeaturedTitle.setOnClickListener {
      val destIntent = ProductsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearCatTitle.setOnClickListener {
      val destIntent = CategoryActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnvector.setOnClickListener {
      val destIntent = ProductDetailActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerHome(
    view: View,
    position: Int,
    item: HomeRowModel
  ): Unit {
    when(view.id) {
    }
  }

  private fun setUpSearchViewSearchBarListener(): Unit {
    binding.searchViewSearchBar.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    companion object {
      const val TAG: String = "HOME_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, HomeActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
