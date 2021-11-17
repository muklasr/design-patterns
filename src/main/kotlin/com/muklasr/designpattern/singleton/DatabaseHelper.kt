package com.muklasr.designpattern.singleton

object DatabaseHelper {

    private var connection: Connection? = null

    fun getConnection(): Connection{
        if(connection == null){
            connection = Connection(host = "localhost", username = "root", password = "root")
        }

        return connection as Connection
    }

}