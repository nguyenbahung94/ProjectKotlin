package com.example.billy.firstappkotlin.kotlininaction.classObjectAndInterface
interface State
interface FocusAble {
    fun showOff() {
        print("hello there")
    }
    fun getCurrentState(): State
    fun restoreState(state: State) {}
}