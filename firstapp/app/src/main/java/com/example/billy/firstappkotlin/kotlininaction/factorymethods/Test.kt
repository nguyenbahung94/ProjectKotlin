package com.example.billy.firstappkotlin.kotlininaction.factorymethods

class Test {
    fun clicked() {
        User.newFacebookUser(123)
        User.newSubscribingUser("123")

    }

}
