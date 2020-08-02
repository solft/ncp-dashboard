package com.hansol.ncpdashboard.controller

import com.hansol.ncpdashboard.dto.client.ServerImageProductListDto
import com.hansol.ncpdashboard.dto.mapper.toServerImageProductListDto
import com.hansol.ncpdashboard.dto.request.ServerImageProductListRequest
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
    fun getServerImageProductList(@RequestBody serverImageProductListRequest: ServerImageProductListRequest): ResponseEntity<ServerImageProductListDto> {
        val serverImageProductListResponse = serverService.getServerImageProductList(serverImageProductListRequest) ?: throw Exception("api 응답이 null입니다")
        if (serverImageProductListResponse.returnMessage != "success") {
            throw Exception("비정상적인 api 응답")
        }
        return ResponseEntity.ok().body(serverImageProductListResponse.toServerImageProductListDto())
    }
}