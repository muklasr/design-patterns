package com.muklasr.designpattern.singleton

fun main() {
    val orderService = OrderService()
    orderService.save(orderId = "0001")

    val orderDetailService = OrderDetailService()
    orderDetailService.save(orderId = "0001", productName = "Ronsi")
    orderDetailService.save(orderId = "0002", productName = "Stalle")
    orderDetailService.save(orderId = "0003", productName = "Boygan")
}