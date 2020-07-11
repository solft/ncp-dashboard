package com.hansol.ncpdashboard.properties

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "ncp")
class NcpProperties {
    lateinit var baseUrl: String
    lateinit var accessKey: String
    lateinit var secretKey: String
}