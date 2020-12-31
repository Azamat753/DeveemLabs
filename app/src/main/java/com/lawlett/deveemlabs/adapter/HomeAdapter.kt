package com.lawlett.deveemlabs.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lawlett.deveemlabs.R
import com.lawlett.deveemlabs.extensions.loadImage
import com.lawlett.deveemlabs.model.ItemModel
import kotlinx.android.synthetic.main.item_object.view.*

class HomeAdapter(private val listener: Listener) :
    RecyclerView.Adapter<HomeAdapter.HomeFragmentHolder>() {
    private var list: MutableList<ItemModel> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeFragmentHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item_object, parent, false)
        return HomeFragmentHolder(view)
    }

    override fun onBindViewHolder(holder: HomeFragmentHolder, position: Int) {
        holder.onBind(list[position],listener)
    }

    override fun getItemCount(): Int {
        return list.count()
    }

    fun initList(listItems: MutableList<ItemModel>) {
        this.list = listItems
    }

    class HomeFragmentHolder(items: View) : RecyclerView.ViewHolder(items) {
        fun onBind(model: ItemModel, listener: Listener) {
            itemView.item_title_tv.text = model.title
            itemView.price_size.text = model.price.toString()
            itemView.currency.text = model.currency
            itemView.location_tv.text = model.location
            itemView.weight.text = model.weight
            itemView.items_image_view.loadImage(model.url.toString())
            itemView.setOnClickListener { listener.onItemClick(model) }
        }
    }

    interface Listener {
        fun onItemClick(item: ItemModel)
    }
}