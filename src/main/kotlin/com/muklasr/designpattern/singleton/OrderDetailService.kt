package com.muklasr.designpattern.singleton

class OrderDetailService {

    fun save(orderId: String, productName: String){
        val connection = DatabaseHelper.getConnection()
        connection.sql(query = "INSERT INTO ORDER_DETAILS ...")
    }

}