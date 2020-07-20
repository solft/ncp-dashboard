package com.hansol.ncpdashboard.dto.response

import com.fasterxml.jackson.annotation.JsonRootName
import com.hansol.ncpdashboard.model.InitScript

@JsonRootName(value = "getInitScriptListResponse")
data class InitScriptListResponse(
        val requestId: String,
        val returnCode: String,
        val returnMessage: String,
        val totalRows: Int,
        val initScriptList: List<InitScript>
)