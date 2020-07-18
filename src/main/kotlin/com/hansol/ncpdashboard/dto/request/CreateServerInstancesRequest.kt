package com.hansol.ncpdashboard.dto.request

data class CreateServerInstancesRequest(
        val serverImageProductCode: String? = null,
        val serverProductCode: String? = null,
        val memberServerImageNo: String? = null,
        val serverName: String? = null,
        val serverDescription: String? = null,
        val loginKeyName: String? = null,
        val isProtectServerTermination: Boolean? = null,
        val serverCreateCount: Int? = null,
        val serverCreateStartNo: Int? = null,
        val internetLineTypeCode: String? = null, // PUBLC, GLBL
        val feeSystemTypeCode: String? = null, // MTRAT(시간요금제), FXSUM(정액제)
        val zoneNo: String? = null,
        val accessControlGroupConfigurationNoList: List<String>? = null,
        val userData: String? = null,
        val initScriptNo: String? = null,
        val raidTypeName: String? = null,
        val instanceTagList_tagKey: List<String>? = null,
        val instanceTagList_tagValue: List<String>? = null
)