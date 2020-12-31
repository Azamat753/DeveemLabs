package com.lawlett.di

import com.lawlett.deveemlabs.home.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

var viewModelModule = module {
    viewModel { HomeViewModel()}
}