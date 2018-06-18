package com.example.billy.firstappkotlin.kotlininaction.classObjectAndInterface

class Button : CLickAble, FocusAble {
    override fun getCurrentState(): State {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showOff() {
        super<CLickAble>.showOff()
        super<FocusAble>.showOff()
    }

    override fun click() = print("clicked")

}