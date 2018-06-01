package com.tifone.learn.kotlin

import org.junit.Assert.*
import org.junit.Test

class DerivedTest {
    @Test
    fun derivedTest() {
        var base = BaseImpl(10)
        Derived(base).print()
    }
}