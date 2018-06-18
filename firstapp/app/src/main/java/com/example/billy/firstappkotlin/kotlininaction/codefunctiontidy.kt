package com.example.billy.firstappkotlin.kotlininaction

class User(val id: Int, val name: String, val address: String)

fun saveUser(user: User) {
    fun validate(user: User,
                 value: String,
                 fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException(
                    "Cannot save user ${user.id}: $fieldName is emp ty")
        }
    }
    validate(user, user.name, "Name")
    validate(user, user.address, "Address")
// Save user to the database
}

