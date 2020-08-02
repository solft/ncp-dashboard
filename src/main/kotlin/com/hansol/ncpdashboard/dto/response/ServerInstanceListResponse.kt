package com.hansol.ncpdashboard.dto.response

import com.fasterxml.jackson.annotation.JsonRootName
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.fasterxml.jackson.annotation.JsonTypeName
import com.hansol.ncpdashboard.model.ServerInstance

@JsonTypeName(value = "getServerInstanceListResponse")
@JsonTypeInfo(include = JsonTypeInfo.As.WRAPPER_OBJECT, use = JsonTypeInfo.Id.NAME)
data class ServerInstanceListResponse(
    val requestId: String,
    val returnCode: String,
    val returnMessage: String,
    val totalRows: Int,
    val serverInstanceList: List<ServerInstance>
)