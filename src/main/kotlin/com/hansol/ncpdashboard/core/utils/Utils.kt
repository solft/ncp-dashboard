package com.hansol.ncpdashboard.core.utils

import kotlin.reflect.full.memberProperties

inline fun <reified T : Any> T.queryStringify() = T::class.memberProperties.filter { it.get(this) != null }.joinToString("&") { "${it.name}=${it.get(this)}" }
