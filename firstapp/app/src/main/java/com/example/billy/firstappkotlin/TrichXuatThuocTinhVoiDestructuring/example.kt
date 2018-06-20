package com.example.billy.firstappkotlin.TrichXuatThuocTinhVoiDestructuring


data class Customer(var name: String, val age: Int)

//functions that return multiple values
data class Result(val x: Int, val y: Int, val z: Int)

fun calculateVector(): Result {
    //calculateVector
    return Result(1, 5, 7)
}


fun main() {
    var customer = Customer("Ba Hung", 24)
    var (name, age) = customer
    print("Name = $name,age = $age")

    var customer2 = Customer("alex", 20)
    var customers = listOf<Customer>(customer, customer2)
    for ((name, age) in customers) {
        print("Name = $name,age = $age")
    }

    var (x1, y1, z1) = calculateVector()

    var usetObject = mapOf<String, Any?>("name" to "Alexander", "age" to 40)
    for ((key, value) in usetObject) {
        print("key= $key,value =$value")
    }
}