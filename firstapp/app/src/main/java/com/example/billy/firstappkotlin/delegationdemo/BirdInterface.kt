package com.example.billy.firstappkotlin.delegationdemo

interface BirdInterface {
    fun flyAndFindFood()
}

class Eagle(val age: Int) : BirdInterface {
    override fun flyAndFindFood() {
        println("I am an eager .I am $age years old.I am flying and finding food")
    }
}

class Cuckoo(b: BirdInterface) : BirdInterface by b {
    override fun flyAndFindFood() {
        println("I am an Cuckoo .I am flying and finding food")

    }

}