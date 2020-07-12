package com.hansol.ncpdashboard.dto.response

import com.fasterxml.jackson.annotation.JsonRootName
import com.hansol.ncpdashboard.model.Product

@JsonRootName(value = "getServerImageProductListResponse")
data class ServerImageProductListResponse(
        val requestId: String,
        val returnCode: String,
        val returnMessage: String,
        val productList: List<Product>
)