package com.tifone.learn.kotlin

class Man:Person(), MyInterface {
    override fun process() {
        println("process")
    }

    init {
        mName = "lucy"
        println(mName)
    }
    fun printName() {
        println(mName)
    }
    override fun getName(): String = "Man : $mName"
}