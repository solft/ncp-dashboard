package com.hansol.ncpdashboard.service

import com.hansol.ncpdashboard.core.NcpWebClient
import com.hansol.ncpdashboard.core.utils.queryStringify
import com.hansol.ncpdashboard.core.utils.queryStringifyWithList
import com.hansol.ncpdashboard.dto.request.CreateServerInstancesRequest
import com.hansol.ncpdashboard.dto.request.ServerProductListRequest
import com.hansol.ncpdashboard.dto.response.CreateServerInstancesResponse
import com.hansol.ncpdashboard.dto.response.RegionListResponse
import com.hansol.ncpdashboard.dto.response.ServerImageProductListResponse
import com.hansol.ncpdashboard.dto.response.ServerProductListResponse
import org.springframework.stereotype.Service

@Service
class ServerService(
        private val client: NcpWebClient
) {

    fun getServerImageProductList() = client.get("$SERVER_V2/getServerImageProductList", ServerImageProductListResponse::class.java)

    fun getServerProductList(serverProductListRequest: ServerProductListRequest) = client.get("$SERVER_V2/getServerProductList", ServerProductListResponse::class.java, serverProductListRequest.queryStringify())

    fun getRegionList() = client.get("$SERVER_V2/getRegionList", RegionListResponse::class.java)

    fun createServerInstances(createServerInstancesRequest: CreateServerInstancesRequest) = client.get("$SERVER_V2/createServerInstances", CreateServerInstancesResponse::class.java, createServerInstancesRequest.queryStringifyWithList())

    companion object {
        private const val SERVER_V2 = "/server/v2"
    }
}