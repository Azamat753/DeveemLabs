package com.lawlett.deveemlabs.home

import android.os.Bundle
import android.view.View
import com.lawlett.deveemlabs.R
import com.lawlett.deveemlabs.adapter.HomeAdapter
import com.lawlett.deveemlabs.base.BaseFragment
import com.lawlett.deveemlabs.detail.DetailActivity
import com.lawlett.deveemlabs.model.ItemModel
import kotlinx.android.synthetic.main.fragment_home.*
import org.koin.android.ext.android.inject

class HomeFragment : BaseFragment(R.layout.fragment_home), HomeAdapter.Listener {

    private val viewModel by inject<HomeViewModel>()
    private lateinit var adapter: HomeAdapter
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
    }

    private fun initAdapter() {
        adapter = HomeAdapter(this)
        recycler_view.adapter = adapter
        viewModel.getData().let { adapter.initList(it) }
    }

    override fun onItemClick(item: ItemModel) {
        DetailActivity.instanceDetail(requireActivity(), item)
    }
}