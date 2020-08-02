package com.hansol.ncpdashboard.dto.response

import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.fasterxml.jackson.annotation.JsonTypeName
import com.hansol.ncpdashboard.model.Product

@JsonTypeName(value = "getServerProductListResponse")
@JsonTypeInfo(include = JsonTypeInfo.As.WRAPPER_OBJECT, use = JsonTypeInfo.Id.NAME)
data class ServerProductListResponse (
        val requestId: String,
        val returnCode: String,
        val returnMessage: String,
        val productList: List<Product>
)