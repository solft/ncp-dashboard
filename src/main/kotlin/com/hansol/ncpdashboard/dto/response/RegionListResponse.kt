package com.hansol.ncpdashboard.dto.response

import com.fasterxml.jackson.annotation.JsonRootName
import com.hansol.ncpdashboard.model.Region

@JsonRootName(value = "getRegionListResponse")
data class RegionListResponse(
        val requestId: String,
        val returnCode: String,
        val returnMessage: String,
        val totalRows: Long,
        val regionList: List<Region>
) {
}