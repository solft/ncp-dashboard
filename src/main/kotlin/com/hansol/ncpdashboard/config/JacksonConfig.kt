package com.hansol.ncpdashboard.config

import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.SerializationFeature
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder

@Configuration
class JacksonConfig {

    @Bean
    fun jackson2ObjectMapperBuilder(): Jackson2ObjectMapperBuilder = Jackson2ObjectMapperBuilder()
            .featuresToEnable(SerializationFeature.WRAP_ROOT_VALUE)
            .featuresToEnable(DeserializationFeature.UNWRAP_ROOT_VALUE)

    @Bean
    fun objectMapper(): ObjectMapper = jackson2ObjectMapperBuilder().build()

}