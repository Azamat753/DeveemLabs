package com.lawlett.deveemlabs.model

data class ItemModel(
    var title: String? = null,
    var itemsAmount: Int? = null,
    var viewsAmount: Int? = null,
    var price: Int? = null,
    var desc: String? = null,
    var updateDay: String? = null,
    var currency: String? = null,
    var location: String? = null,
    var weight: String? = null,
    var url: String? = null
)
