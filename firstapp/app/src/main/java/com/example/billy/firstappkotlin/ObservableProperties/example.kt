package com.example.billy.firstappkotlin.ObservableProperties

import kotlin.properties.Delegates

class User(Name: String) {
    //notification when currentAddress changes
    //run this block when currentAddress changes
    var currentAddress: String by Delegates.observable("No address") { property, oldValue, newValue ->
        run {
            println("Address is changing")
            println("From $oldValue->$newValue")
            println("property's name = ${property.name}")
        }

    }
}