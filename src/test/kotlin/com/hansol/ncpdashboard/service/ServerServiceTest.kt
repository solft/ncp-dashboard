package com.hansol.ncpdashboard.service

import com.fasterxml.jackson.databind.ObjectMapper
import com.hansol.ncpdashboard.dto.response.RegionListResponse
import com.hansol.ncpdashboard.model.Region
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
internal class ServerServiceTest {

    @Autowired
    lateinit var serverService: ServerService

    @Autowired
    lateinit var objectMapper: ObjectMapper


    @Test
    fun `getServerImageProductList Test`() {
        val serverImageProductList = serverService.getServerImageProductList()

        println(serverImageProductList)
    }

    @Test
    fun `getRegionList Test`() {
        val regionResponse = serverService.getRegionList()

        println(objectMapper.writeValueAsString(regionResponse))
    }

    @Test
    fun `serilize Test`() {
        val region1 = Region("Korea", "KR", "한국")
        val region2 = Region("usa", "US", "미국")
        val regions = listOf(region1, region2)
        val regionResponse = RegionListResponse("reqId", "rtrn_cd", "rtrn_msg", 10L, regions)

        val writeValueAsString = objectMapper.writeValueAsString(regionResponse)

        println(writeValueAsString)
    }
}