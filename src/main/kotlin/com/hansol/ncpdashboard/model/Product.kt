package com.hansol.ncpdashboard.model

import com.hansol.ncpdashboard.core.model.CommonCode

data class Product(
        val productCode: String,
        val productName: String,
        val productType: CommonCode,
        val productDescription: String,
        val infraResourceType: CommonCode,
        val infraResourceDetailType: CommonCode?,
        val cpuCount: Int?,
        val memorySize: Long?,
        val baseBlockStorageSize: Long?,
        val platformType: CommonCode?,
        val osInformation: String?,
        val diskType: CommonCode?,
        val dbKindCode: String?,
        val addBlockStorageSize: Long?
)