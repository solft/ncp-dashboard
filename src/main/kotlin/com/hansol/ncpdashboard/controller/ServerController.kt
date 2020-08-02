package com.hansol.ncpdashboard.controller

import com.hansol.ncpdashboard.dto.request.ServerImageProductListRequest
import com.hansol.ncpdashboard.dto.response.ServerImageProductListResponse
import com.hansol.ncpdashboard.service.ServerService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class ServerController(
        val serverService: ServerService
) {

    @PostMapping("/serverImageProduct")
    fun getServerImageProductList(@RequestBody serverImageProductListRequest: ServerImageProductListRequest): ResponseEntity<ServerImageProductListResponse> {
        println(serverImageProductListRequest)
        val serverImageProductListResponse = serverService.getServerImageProductList(serverImageProductListRequest)
        return ResponseEntity.ok().body(serverImageProductListResponse)
    }
}