package com.tifone.learn.kotlin

import org.junit.Assert.*
import org.junit.Test

class DelegateTest {
    @Test
    fun delegateTest() {
        var c1 = Class1()
        var c2 = Class2()
        c1.name = "C1 name"
        c2.name = "C2 name"
        println(c1.name)
        println(c2.name)
    }
}