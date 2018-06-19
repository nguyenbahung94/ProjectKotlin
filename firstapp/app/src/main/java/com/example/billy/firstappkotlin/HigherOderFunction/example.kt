package com.example.billy.firstappkotlin.HigherOderFunction

import java.util.*

//higher-order function = function that takes functions as parameters,or returns a function
class Lock {
    fun lock() {
        print("lock")
    }

    fun unlock() {
        print("unlock")
    }
}

var bodyFunction = fun(): Int {
    val taskId = Random().nextInt()
    println("This is the body function. TaskId= $taskId")
    return taskId
}

fun doATask(lock: Lock, body: () -> Int): Int {
    lock.lock()
    try {
        return body()
    } finally {
        lock.unlock()
    }
}

fun main() {
    doATask(Lock(), bodyFunction)
    var ints: Collection<Int> = listOf(1, 2, 3, 4, 56, 6, 7, 8, 9, 9)
    var maxValue = getMaxValueInCollection(ints, compare)
}

/*
the result
Lock
This is the body function taskId=random number
unlock
* */
//ex2: function that takes functions as parameters,returns a value
val compare: (Int, Int) -> Boolean = { x, y -> x < y }

fun getMaxValueInCollection(collection: Collection<Int>, less: (Int, Int) -> Boolean): Int? {
    var maxValue: Int? = null
    for (item in collection) {
        if (maxValue == null || less(maxValue, item)) {
            maxValue = item
        }
    }
    return maxValue
}

