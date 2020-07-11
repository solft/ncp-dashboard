package com.hansol.ncpdashboard.service

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
internal class ServerServiceTest {

    @Autowired
    lateinit var serverService: ServerService


    @Test
    fun `getRegonList Test`() {
        val regionResponse = serverService.getRegionList()

        println(regionResponse)
    }
}