package com.hansol.ncpdashboard.dto.mapper

import com.hansol.ncpdashboard.dto.client.ServerImageProductListDto
import com.hansol.ncpdashboard.dto.response.ServerImageProductListResponse

fun ServerImageProductListResponse.toServerImageProductListDto() = ServerImageProductListDto(
        productList = productList,
        totalRows = totalRows
)