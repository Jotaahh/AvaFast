package com.gustavosapplication.app.modules.writereview.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.gustavosapplication.app.R
import com.gustavosapplication.app.appcomponents.base.BaseActivity
import com.gustavosapplication.app.databinding.ActivityWriteReviewBinding
import com.gustavosapplication.app.modules.comment.ui.CommentActivity
import com.gustavosapplication.app.modules.home.ui.HomeActivity
import com.gustavosapplication.app.modules.writereview.`data`.viewmodel.WriteReviewVM
import kotlin.String
import kotlin.Unit

class WriteReviewActivity : BaseActivity<ActivityWriteReviewBinding>(R.layout.activity_write_review)
    {
  private val viewModel: WriteReviewVM by viewModels<WriteReviewVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.writeReviewVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowright.setOnClickListener {
      val destIntent = CommentActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnProximo.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "WRITE_REVIEW_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, WriteReviewActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
