package com.hansol.ncpdashboard.dto.request

import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_EMPTY)
data class ServerProductListRequest(
        val serverImageProductCode: String,
        val exclusionProductCode: String? = null,
        val productCode: String? = null,
        val generationCode: String? = null, // [G1, G2]
        val regionNo: String? = null,
        val zoneNo: String? = null,
        val internetLineTypeCode: String? = null // [PUBLC, GLBL]
)