package com.tifone.learn.kotlin

import junit.framework.Assert.*
import org.junit.Test


class KotlinClassTest {
    @Test
    fun createInstanceTest() {
        var instance1 = KotlinClass("Hello Kotlin")
        var instance2 = KotlinClass(23, "Jack")

        var singletonInstance1 = KotlinClass.Singleton.getInstance()
        var singletonInstance2 = KotlinClass.Singleton.getInstance()
        assertEquals(singletonInstance1, singletonInstance2)

        instance1.key = 200
        assertEquals(200, instance1.key)

        assertEquals(globalFunction(), 100)
        assertEquals(globalFunction(50), 50)

        instance1.doSomething("www.baidu.com", type = 100)
        instance1.addName("Jack", "Mack", "Mike", "Larry")

        globalFunction2(1)
        globalFunction3(3)
    }
}