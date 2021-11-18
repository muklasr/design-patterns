package com.muklasr.designpattern.builder.examples.customer

fun main() {
    val customerA: Customer = CustomerBuilder()
        .setFirstName("Muklas")
        .setLastName("Rahmanto")
        .setPhone("08880008765")
        .setEmail("muklas@gmail.com")
        .setAddress("Bantul")
        .build()

    val customerB: Customer = CustomerBuilder()
        .setFirstName("Andre")
        .setPhone("08981196777")
        .setEmail("muklas@gmail.com")
        .setAddress("Sleman")
        .build()

}