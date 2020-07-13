package com.hansol.ncpdashboard.service

import com.hansol.ncpdashboard.core.NcpWebClient
import com.hansol.ncpdashboard.dto.request.ServerProductListRequest
import com.hansol.ncpdashboard.dto.response.RegionListResponse
import com.hansol.ncpdashboard.dto.response.ServerImageProductListResponse
import com.hansol.ncpdashboard.dto.response.ServerProductListResponse
import org.springframework.stereotype.Service

@Service
class ServerService(
        private val client: NcpWebClient
) {

    fun getServerImageProductList() = client.get("$SERVER_V2/getServerImageProductList", ServerImageProductListResponse::class.java)

    fun getServerProductList(serverImageProductListRequest: ServerProductListRequest) = client.post("$SERVER_V2/getServerProductList", serverImageProductListRequest, ServerProductListResponse::class.java)

    fun getRegionList() = client.get("$SERVER_V2/getRegionList", RegionListResponse::class.java)

    companion object {
        private const val SERVER_V2 = "/server/v2"
    }
}