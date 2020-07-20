package com.hansol.ncpdashboard.dto.request

data class ServerInstanceRequest(
        val serverInstanceNoList: List<String>? = null,
        val searchFilterName: String? = null,
        val searchFilterValue: String? = null,
        val pageNo: Int? = null,
        val pageSize: Int? = null,
        val serverInstanceStatusCode: String? = null,
        val internetLineTypeCode: String? = null,
        val regionNo: String? = null,
        val zoneNo: String? = null,
        val baseBlockStorageDiskTypeCode: String? = null,
        val baseBlockStorageDiskDetailTypeCode: String? = null,
        val sortedBy: String? = null, // serverName, serverInstanceNo
        val sortingOrder: String? = null, // ascending, descending
        val serverInstanceTypeCodeList: List<String>? = null,
        val tagKeyList: List<String>? = null,
        val tagKeyValue: List<String>? = null
)