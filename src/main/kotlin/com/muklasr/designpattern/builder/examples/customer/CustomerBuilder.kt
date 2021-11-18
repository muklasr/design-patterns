package com.muklasr.designpattern.builder.examples.customer

class CustomerBuilder {

    private var firstName: String = ""
    private var lastName: String = ""
    private var address: String = ""
    private var email: String = ""
    private var phone: String = ""

    fun setFirstName(firstName: String): CustomerBuilder {
        this.firstName = firstName
        return this
    }

    fun setLastName(lastName: String): CustomerBuilder {
        this.lastName = lastName
        return this
    }

    fun setAddress(address: String): CustomerBuilder {
        this.address = address
        return this
    }

    fun setEmail(email: String): CustomerBuilder {
        this.email = email
        return this
    }

    fun setPhone(phone: String): CustomerBuilder {
        this.phone = phone
        return this
    }

    fun build(): Customer = Customer(
        firstName = firstName,
        lastName = lastName,
        address = address,
        email = email,
        phone = phone,
    )

}