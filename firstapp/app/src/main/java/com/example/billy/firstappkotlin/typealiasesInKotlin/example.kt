package com.example.billy.firstappkotlin.typealiasesInKotlin

typealias IntSet = Set<Int>
typealias StringMap<K> = MutableMap<K, String?>

fun main() {
    var stringMaps: MutableMap<String, String?> = mutableMapOf("k1" to "value1", "k2" to "value2", "k3" to "value3")
    println("stringMaps = $stringMaps")
}

class A {
    inner class X {
        init {
            println("this is class X of A")
        }
    }
}

class B {
    inner class X {
        init {
            print("This is class X of B")
        }
    }
}

typealias XofA = A.X
typealias XofB = B.X

fun testMain() {
    //val xofA=A().X()
    val xofA = A().XofA()
    val xofB = B().XofB()
}