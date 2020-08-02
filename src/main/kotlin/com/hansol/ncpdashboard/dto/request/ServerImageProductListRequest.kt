package com.hansol.ncpdashboard.dto.request

import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_EMPTY)
data class ServerImageProductListRequest(
        val exclusionProductCode: String? = null,
        val productCode: String? = null,
        val platformTypeCodeList: List<String>? = null,
        val blockStorageSize: Int? = null,
        val regionNo: String? = null,
        val infraResourceDetailTypeCode: String? = null
)