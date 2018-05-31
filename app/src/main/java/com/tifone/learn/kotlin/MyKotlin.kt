package com.tifone.learn.kotlin

/**
 * Create by Tifone on 2018/5/31.
 */

fun ifCondition() {

    var a: Int = 20
    var b = 30
    var max: Int

    if (a < b) max = b

    var min: Int
    if (a > b) {
        min = b
    } else {
        min = a
    }
}

fun ifCondition2() {
    var a = 20
    var b = 30
    val max = if (a > b) a else b
    println(max)

    val min = if (a > b) {
        println("Choose a")
        a
    } else {
        println("Choose b")
        b
    }
}

fun whenCondition(x: Int) {
    when (x) {
        1 -> {
            println("x == 1")
            println("Hell world")
        }
        2 -> println("x == 2")
        3,4 -> println("x == 3 or x == 4")
        in 5..9 -> println("x is 5..9")
        !in 1..11 -> println("x is not 1..11")
        else -> println("x is $x")
    }
    when (x) {
        getValue(2) -> println("条件满足")
        getValue(3) -> println("条件不满足")
        else -> println("未知")
    }
}

private fun getValue(value: Int): Int {
    return value * value;
}

