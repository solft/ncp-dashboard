package com.hansol.ncpdashboard.utils

import com.hansol.ncpdashboard.properties.NcpProperties
import org.apache.tomcat.util.codec.binary.Base64
import org.springframework.stereotype.Component
import javax.crypto.Mac
import javax.crypto.spec.SecretKeySpec

@Component
class SignatureGenerator(
        private val ncpProperties: NcpProperties
) {
    fun makeSignature(method: String, uri: String, timestamp: Long): String {
        val space = " "
        val newLine = "\n"
        val accessKey = ncpProperties.accessKey
        val secretKey = ncpProperties.secretKey

        val message = StringBuilder()
                .append(method)
                .append(space)
                .append(uri)
                .append(newLine)
                .append(timestamp)
                .append(newLine)
                .append(accessKey)
                .toString()

        val signingKey = SecretKeySpec(secretKey.toByteArray(), "HamcSHA256")
        val mac = Mac.getInstance("HmacSHA256")
        mac.init(signingKey)

        val rawHmac = mac.doFinal(message.toByteArray())

        return Base64.encodeBase64String(rawHmac)
    }
}