package com.muklasr.designpattern.singleton

class OrderService {

    fun save(orderId: String){
        val connection = DatabaseHelper.getConnection()
        connection.sql(query = "INSERT INTO ORDERS ...")
    }

}