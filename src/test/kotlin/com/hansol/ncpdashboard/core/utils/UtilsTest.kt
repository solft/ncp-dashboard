package com.hansol.ncpdashboard.core.utils

import com.hansol.ncpdashboard.dto.request.ServerProductListRequest
import org.junit.jupiter.api.Test
import kotlin.reflect.full.memberProperties

class UtilsTest {

    @Test
    fun queryStringifyTest() {
        println("TEST START")
        val serverProductListRequest = ServerProductListRequest(serverImageProductCode = "test", regionNo = "10")

        val queryStringify = serverProductListRequest.queryStringify()
        println(queryStringify)
    }


}