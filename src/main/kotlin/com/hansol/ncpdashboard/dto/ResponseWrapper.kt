package com.hansol.ncpdashboard.dto

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import com.hansol.ncpdashboard.dto.response.RegionResponse

data class ResponseWrapper(
        @JsonProperty(value = "getRegionListResponse")
        val response: RegionResponse
) {

}