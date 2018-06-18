package com.example.billy.firstappkotlin.kotlininaction.classObjectAndInterface

interface CLickAble {
    fun click()
    fun showOff() {
        print("hello there")
    }

    fun setFocus(b: Boolean) {
        print("I ${if (b) "got" else "lost"}focus.")
    }

}