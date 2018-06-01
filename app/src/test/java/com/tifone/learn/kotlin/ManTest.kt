package com.tifone.learn.kotlin

import org.junit.Assert.*
import org.junit.Test

class ManTest {
    @Test
    fun manTest() {
        var man:Man = Man()
        val man1 = Man()
        var value: Int = 100
        value = 99
        man.printName()
        println(man.getName())
        println(man.getSomthingName())
        var woman = Woman()
        println(woman.getAddress())
        woman.swap()
        woman.value = "Language teacher"
        println(woman.value)
    }
}