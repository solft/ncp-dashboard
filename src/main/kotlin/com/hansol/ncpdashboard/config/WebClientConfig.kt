package com.hansol.ncpdashboard.config

import com.hansol.ncpdashboard.core.properties.NcpProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.HttpHeaders
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.client.WebClient

@Configuration
class WebClientConfig(
        private val ncpProperties: NcpProperties
) {

    @Bean
    fun webClient(): WebClient {

        return WebClient.builder()
                .baseUrl(ncpProperties.baseUrl)
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build()
    }
}