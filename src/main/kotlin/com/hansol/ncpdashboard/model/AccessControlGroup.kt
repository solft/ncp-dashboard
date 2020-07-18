package com.hansol.ncpdashboard.model

import java.util.*

data class AccessControlGroup(
        val accessControlGroupConfigurationNo: String,
        val accessControlGroupName: String,
        val accessControlGroupDescription: String,
        val isDefaultGroup: Boolean,
        val createDate: Date
)