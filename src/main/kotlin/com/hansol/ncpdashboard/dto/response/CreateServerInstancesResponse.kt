package com.hansol.ncpdashboard.dto.response

import com.fasterxml.jackson.annotation.JsonRootName
import com.hansol.ncpdashboard.model.ServerInstance

@JsonRootName(value = "createServerInstancesResponse")
data class CreateServerInstancesResponse(
        val requestId: String,
        val returnCode: String,
        val returnMessage: String,
        val totalRows: Int,
        val serverInstanceList: List<ServerInstance>
)