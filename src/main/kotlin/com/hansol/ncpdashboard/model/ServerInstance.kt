package com.hansol.ncpdashboard.model

import com.hansol.ncpdashboard.core.model.CommonCode
import java.util.*

data class ServerInstance(
        val serverInstanceNo: Long,
        val serverName: String,
        val serverDescription: String?,
        val cpuCount: Int,
        val memorySize: Long,
        val baseBlockStorageSize: Long,
        val platformType: CommonCode,
        val loginKeyName: String,
        val isFeeChargingMonitoring: Boolean,
        val publicIp: String?,
        val privateIp: String,
        val serverImageName: String,
        val serverInstanceStatus: CommonCode,
        val serverInstanceOperation: CommonCode,
        val serverInstanceStatusName: String,
        val createDate: Date,
        val uptime: Date,
        val serverImageProductCode: String,
        val serverProductCode: String,
        val isProtectServerTermination: Boolean,
        val portForwardingPublicIp: String,
        val portForwardingExternalPort: Int?,
        val portForwardingInternalPort: Int?,
        val zone: Zone,
        val region: Region,
        val baseBlockStorageDiskType: CommonCode,
        val baseBlockStorageDiskDetailType: CommonCode,
        val internetLineType: CommonCode,
        val serverInstanceType: CommonCode,
        val userData: String?,
        val accessControlGroupList: List<AccessControlGroup>?
)