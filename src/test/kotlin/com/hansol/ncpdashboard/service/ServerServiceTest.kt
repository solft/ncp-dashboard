package com.hansol.ncpdashboard.service

import com.fasterxml.jackson.databind.ObjectMapper
import com.hansol.ncpdashboard.dto.request.CreateServerInstancesRequest
import com.hansol.ncpdashboard.dto.request.ServerImageProductListRequest
import com.hansol.ncpdashboard.dto.request.ServerInstanceRequest
import com.hansol.ncpdashboard.dto.request.ServerProductListRequest
import com.hansol.ncpdashboard.dto.response.RegionListResponse
import com.hansol.ncpdashboard.model.Region
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import kotlin.reflect.full.memberProperties

@SpringBootTest
internal class ServerServiceTest {

    @Autowired
    lateinit var serverService: ServerService

    @Autowired
    lateinit var objectMapper: ObjectMapper


    @Test
    fun getServerImageProductListTest() {
        val serverImageProductList = serverService.getServerImageProductList(ServerImageProductListRequest())

        println(serverImageProductList)
    }

    @Test
    fun getServerProductListTest() {
        // Server Image Product example : SPSW0LINUX000046, SPSW0LINUX000045, SPSW0LINUX000031
        val serverProductListRequest = ServerProductListRequest(serverImageProductCode = "SPSW0LINUX000046")
        val serverProductListResponse = serverService.getServerProductList(serverProductListRequest)

        println(objectMapper.writeValueAsString(serverProductListResponse))
    }

    @Test
    fun getServerInstanceListTest() {
        val serverInstanceList = serverService.getServerInstanceList(ServerInstanceRequest())

        println(serverInstanceList)
    }

    @Test
    fun createServerTest() {
        // Server Product example : SPSVRHICPU000001, SPSVRHICPU000002
        val createServerInstancesRequest = CreateServerInstancesRequest(serverImageProductCode = "SPSW0LINUX000046", serverProductCode = "SPSVRSTAND000072", serverName = "object-test")
        val test = serverService.createServerInstances(createServerInstancesRequest)

        println((test))
    }

    @Test
    fun `getRegionList Test`() {
        val regionResponse = serverService.getRegionList()

        println(objectMapper.writeValueAsString(regionResponse))
    }

    @Test
    fun getInitScriptListTest() {
        val initScriptListResponse = serverService.getInitScriptList()

        println(objectMapper.writeValueAsString(initScriptListResponse))
    }

    @Test
    fun `serilize Test`() {
        val region1 = Region("Korea", "KR", "한국")
        val region2 = Region("usa", "US", "미국")
        val regions = listOf(region1, region2)
        val regionResponse = RegionListResponse("reqId", "rtrn_cd", "rtrn_msg", 10, regions)

        val writeValueAsString = objectMapper.writeValueAsString(regionResponse)

        println(writeValueAsString)
    }

    @Test
    fun `objectMapper test`() {
        val serverProductListRequest = ServerProductListRequest(serverImageProductCode = "SPSW0LINUX000046")

        val string = objectMapper.writeValueAsString(serverProductListRequest)

        println(string)
    }

    @Test
    fun `queryString test`() {
        val serverProductListRequest = ServerProductListRequest(serverImageProductCode = "SPSW0LINUX000046")


        for (prop in ServerProductListRequest::class.memberProperties) {
            println("${prop.name}, ${prop.get(serverProductListRequest)}")
        }

    }
}