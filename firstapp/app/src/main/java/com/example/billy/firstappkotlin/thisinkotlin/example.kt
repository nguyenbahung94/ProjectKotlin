package com.example.billy.firstappkotlin.thisinkotlin

class C {

}

class A {
    //label=@A
    inner class B {
        //label=@B
        fun C.extendingFunction1() {
            val thisAtA = this@A
            print("thisAtA= $thisAtA")

            val thisAtB = this@B
            println("thisAtB = $thisAtB")
        }

        fun methodOfClassB() {
            var cObject = C()
            cObject.extendingFunction1()
        }
    }

}

fun Main() {

}