package com.hansol.ncpdashboard.dto.response

import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.fasterxml.jackson.annotation.JsonTypeName
import com.hansol.ncpdashboard.model.Product

@JsonTypeName(value = "getServerImageProductListResponse")
@JsonTypeInfo(include = JsonTypeInfo.As.WRAPPER_OBJECT, use = JsonTypeInfo.Id.NAME)
data class ServerImageProductListResponse(
        val requestId: String,
        val returnCode: String,
        val returnMessage: String,
        val totalRows: Int,
        val productList: List<Product>
)