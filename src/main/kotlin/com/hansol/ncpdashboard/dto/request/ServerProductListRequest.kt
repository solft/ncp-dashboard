package com.hansol.ncpdashboard.dto.request

import com.fasterxml.jackson.annotation.JsonInclude
import kotlin.reflect.full.memberProperties

@JsonInclude(JsonInclude.Include.NON_EMPTY)
data class ServerProductListRequest(
        val serverImageProductCode: String,
        val exclusionProductCode: String? = "",
        val productCode: String? = "",
        val generationCode: String? = "", // [G1, G2]
        val regionNo: String? = "",
        val zoneNo: String? = "",
        val internetLineTypeCode: String? = "" // [PUBLC, GLBL]
)