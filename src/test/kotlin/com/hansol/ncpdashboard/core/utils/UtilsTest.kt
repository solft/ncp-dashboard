package com.hansol.ncpdashboard.core.utils

import com.hansol.ncpdashboard.dto.request.CreateServerInstancesRequest
import com.hansol.ncpdashboard.dto.request.ServerProductListRequest
import org.junit.jupiter.api.Test

class UtilsTest {

    @Test
    fun queryStringifyTest() {
        println("TEST START")
        val serverProductListRequest = ServerProductListRequest(serverImageProductCode = "test", regionNo = "10")

        val queryStringify = serverProductListRequest.queryStringify()
        println(queryStringify)
    }

    @Test
    fun queryStringifyListTest() {
        val createServerInstancesRequest = CreateServerInstancesRequest(
                serverImageProductCode = "testServerImage",
                isProtectServerTermination = true,
                serverCreateCount = 10,
                accessControlGroupConfigurationNoList = listOf("a", "b", "c"),
                instanceTagList_tagKey = listOf("key1", "key2", "key3"),
                instanceTagList_tagValue = listOf("value1", "value2", "value3")
        )

        val queryString = createServerInstancesRequest.queryStringifyWithList()
        println(queryString)
    }


}