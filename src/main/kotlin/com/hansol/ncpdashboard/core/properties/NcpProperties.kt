package com.hansol.ncpdashboard.core.properties

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@ConfigurationProperties(prefix = "ncp")
class NcpProperties {
    lateinit var baseUrl: String
    lateinit var accessKey: String
    lateinit var secretKey: String
}