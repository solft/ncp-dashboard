package com.hansol.ncpdashboard

import com.hansol.ncpdashboard.properties.NcpProperties
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(NcpProperties::class)
class NcpDashboardApplication

fun main(args: Array<String>) {
    runApplication<NcpDashboardApplication>(*args)
}
