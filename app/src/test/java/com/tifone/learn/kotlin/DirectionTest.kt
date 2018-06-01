package com.tifone.learn.kotlin

import org.junit.Assert.*
import org.junit.Test

class DirectionTest {
    @Test
    fun directionTest() {
        var direction1: Direction = Direction.EAST
        var direction2: Direction = Direction.NORTH
        println("name = ${direction1.name} value = ${direction1.ordinal}")
        println("name = ${direction2.name} value = ${direction2.ordinal}")
    }
}