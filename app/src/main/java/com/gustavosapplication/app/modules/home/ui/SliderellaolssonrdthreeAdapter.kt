package com.gustavosapplication.app.modules.home.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.gustavosapplication.app.databinding.SlideritemHome1Binding
import com.gustavosapplication.app.modules.home.`data`.model.ImageSliderSliderellaolssonrdthreeModel
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int

class SliderellaolssonrdthreeAdapter(
  val dataList: ArrayList<ImageSliderSliderellaolssonrdthreeModel>,
  val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderSliderellaolssonrdthreeModel>(dataList, mIsInfinite) {
  override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ) {
    if (binding is SlideritemHome1Binding) {
      binding.imageSliderSliderellaolssonrdthreeModel = dataList[listPosition]
    }
  }

  override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemHome1Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}
