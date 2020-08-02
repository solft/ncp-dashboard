package com.hansol.ncpdashboard.dto.client

import com.hansol.ncpdashboard.model.Product

data class ServerImageProductListDto(
    val productList: List<Product>,
    val totalRows: Int
)