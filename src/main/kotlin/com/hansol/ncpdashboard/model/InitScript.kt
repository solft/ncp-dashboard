package com.hansol.ncpdashboard.model

import com.hansol.ncpdashboard.core.model.CommonCode
import java.util.*

data class InitScript(
        val initScriptNo: String,
        val initScriptName: String,
        val createDate: Date,
        val initScriptContent: String,
        val initScriptDescription: String?,
        val osType: CommonCode
)