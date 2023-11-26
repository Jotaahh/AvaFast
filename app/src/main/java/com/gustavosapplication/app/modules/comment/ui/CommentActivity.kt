package com.gustavosapplication.app.modules.comment.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.gustavosapplication.app.R
import com.gustavosapplication.app.appcomponents.base.BaseActivity
import com.gustavosapplication.app.databinding.ActivityCommentBinding
import com.gustavosapplication.app.modules.comment.`data`.model.CommentRowModel
import com.gustavosapplication.app.modules.comment.`data`.viewmodel.CommentVM
import com.gustavosapplication.app.modules.productdetail.ui.ProductDetailActivity
import com.gustavosapplication.app.modules.writereview.ui.WriteReviewActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CommentActivity : BaseActivity<ActivityCommentBinding>(R.layout.activity_comment) {
  private val viewModel: CommentVM by viewModels<CommentVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val commentAdapter = CommentAdapter(viewModel.commentList.value?:mutableListOf())
    binding.recyclerComment.adapter = commentAdapter
    commentAdapter.setOnItemClickListener(
    object : CommentAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : CommentRowModel) {
        onClickRecyclerComment(view, position, item)
      }
    }
    )
    viewModel.commentList.observe(this) {
      commentAdapter.updateData(it)
    }
    binding.commentVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageAddOne.setOnClickListener {
      val destIntent = WriteReviewActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowright.setOnClickListener {
      val destIntent = ProductDetailActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerComment(
    view: View,
    position: Int,
    item: CommentRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "COMMENT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CommentActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
