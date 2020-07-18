package com.hansol.ncpdashboard.core.utils

import kotlin.reflect.full.memberProperties

inline fun <reified T : Any> T.queryStringify() = T::class.memberProperties.filter { it.get(this) != null }.filter { it.get(this) !is Iterable<*> }.joinToString("&", "&") { "${it.name}=${it.get(this)}" }

inline fun <reified T : Any> T.queryStringifyWithList(): String {
    var result = ""
    for (memberProperty in T::class.memberProperties) {
        if (memberProperty.get(this) != null) {
            if (memberProperty.get(this) is List<*>) {
                for ((index, value) in (memberProperty.get(this) as List<*>).withIndex()) {
                    val key = memberProperty.name.split("_")
                    result += if (key.size == 1) {
                        "&${key[0]}.${index + 1}=${value}"
                    } else {
                        "&${key[0]}.${index + 1}.${key[1]}=${value}"
                    }
                }
            } else {
                result += "&${memberProperty.name}=${memberProperty.get(this)}"
            }
        }
    }

    return result
}
