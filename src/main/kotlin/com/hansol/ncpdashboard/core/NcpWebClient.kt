package com.hansol.ncpdashboard.core

import com.hansol.ncpdashboard.properties.NcpProperties
import com.hansol.ncpdashboard.utils.SignatureGenerator
import org.springframework.http.HttpMethod
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.client.WebClient

@Component
class NcpWebClient(
        private val webClient: WebClient,
        private val signatureGenerator: SignatureGenerator,
        private val ncpProperties: NcpProperties
) {

    fun <T> get(uri: String, type: Class<T>): T? {
        val timestamp = System.currentTimeMillis()
        val jsonUri = "$uri?responseFormatType=JSON"
        return webClient.get()
                .uri(jsonUri)
                .header(X_NCP_APIGW_TIMESTMAP, timestamp.toString())
                .header(X_NCP_IAM_ACCESS_KEY, ncpProperties.accessKey)
                .header(X_NCP_APIGW_SIGNATURE_V2, signatureGenerator.makeSignature(HttpMethod.GET.name, jsonUri, timestamp))
                .retrieve()
                .bodyToMono(type)
                .block()
    }

    fun <T> post(uri: String, body: Any, type: Class<T>): T? {
        val timestamp = System.currentTimeMillis()
        val jsonUri = "$uri?responseFormatType=JSON"
        return webClient.post()
                .uri(jsonUri)
                .header(X_NCP_APIGW_TIMESTMAP, timestamp.toString())
                .header(X_NCP_IAM_ACCESS_KEY, ncpProperties.accessKey)
                .header(X_NCP_APIGW_SIGNATURE_V2, signatureGenerator.makeSignature(HttpMethod.POST.name, jsonUri, timestamp))
                .bodyValue(body)
                .retrieve()
                .bodyToMono(type)
                .block()
    }

    companion object {
        const val X_NCP_APIGW_TIMESTMAP = "x-ncp-apigw-timestamp"
        const val X_NCP_IAM_ACCESS_KEY= "x-ncp-iam-access-key"
        const val X_NCP_APIGW_SIGNATURE_V2= "x-ncp-apigw-signature-v2"
    }
}