package com.lawlett.deveemlabs.detail

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.lawlett.deveemlabs.R
import com.lawlett.deveemlabs.extensions.loadImage
import com.lawlett.deveemlabs.model.ItemModel
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        setData()
    }

    private fun setData() {
        item_name.text = item?.title
        detail_location.text = item?.location
        amount_tv.text = item?.price.toString()
        currency_tv_detail.text = item?.currency
        image_detail.loadImage(item?.url.toString())
        desc_detail_tv.text=item?.desc
        views_amount.text=item?.viewsAmount.toString()
        items_amount_tv.text=item?.itemsAmount.toString()
        update_day.text=item?.updateDay

    }

    companion object {
        var item: ItemModel? = null
        fun instanceDetail(activity: Activity?, id: ItemModel?) {
            val intent = Intent(activity, DetailActivity::class.java)
            activity?.startActivity(intent)
            this.item = id
        }
    }
}