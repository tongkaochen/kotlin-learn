package com.tifone.learn.kotlin

abstract class Comparable<in T> {
    abstract fun comp(input: T): Int
}
fun demo(comparable: Comparable<Number>) {
    comparable.comp(8)
    var value:Comparable<Double> = comparable
}