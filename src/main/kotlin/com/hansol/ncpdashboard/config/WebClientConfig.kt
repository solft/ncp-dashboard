package com.hansol.ncpdashboard.config

import com.fasterxml.jackson.databind.ObjectMapper
import com.hansol.ncpdashboard.properties.NcpProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.HttpHeaders
import org.springframework.http.MediaType
import org.springframework.http.codec.json.Jackson2JsonDecoder
import org.springframework.http.codec.json.Jackson2JsonEncoder
import org.springframework.web.reactive.function.client.ExchangeStrategies
import org.springframework.web.reactive.function.client.WebClient

@Configuration
class WebClientConfig(
        private val ncpProperties: NcpProperties,
        private val objectMapper: ObjectMapper
) {

    @Bean
    fun webClient(): WebClient {

        val exchangeStrategies = ExchangeStrategies.builder()
                .codecs { configurer ->
                    configurer.defaultCodecs().jackson2JsonDecoder(Jackson2JsonDecoder(objectMapper))
                    configurer.defaultCodecs().jackson2JsonEncoder(Jackson2JsonEncoder(objectMapper))
                 }
                .build()

        return WebClient.builder()
                .exchangeStrategies(exchangeStrategies)
                .baseUrl(ncpProperties.baseUrl)
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build()
    }
}