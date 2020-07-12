package com.hansol.ncpdashboard.service

import com.hansol.ncpdashboard.core.NcpWebClient
import com.hansol.ncpdashboard.dto.response.RegionResponse
import org.springframework.stereotype.Service

@Service
class ServerService(
        private val client: NcpWebClient
) {

    fun getRegionList() = client.get("/server/v2/getRegionList", RegionResponse::class.java)

}