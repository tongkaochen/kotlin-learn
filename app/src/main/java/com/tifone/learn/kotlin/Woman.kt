package com.tifone.learn.kotlin

class Woman : Jobs("Teacher") {
    override fun getAddress(): String = "shenzhen"
    var firstName: String = ""

    fun printName() = println(getJobsName())
    fun MutableList<Int>.swap(index1: Int, index2: Int) {
        var temp = this[index1]
        this[index1] = this[index2]
        this[index2] = temp
    }

    fun swap() {
        var mutableList = mutableListOf(1, 2, 3, 4)
        mutableList.swap(1, 3)
        println(mutableList)
    }

}

var Woman.value: String
    get() = firstName
    set(value) {
        firstName = value
    }
