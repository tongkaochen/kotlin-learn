package com.tifone.learn.kotlin

abstract class Source<out T> {
    abstract fun nextT(): T
}

fun demo(str: Source<String>) {
    val objects: Source<Any> = str
}