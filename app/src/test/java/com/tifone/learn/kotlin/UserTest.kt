package com.tifone.learn.kotlin

import org.junit.Assert.*
import org.junit.Test

class UserTest {
    @Test
    fun instanceTest() {
        var user1 = User("Mike", 27)
        var user2 = User("Mike", 27)
        println(user1)
        println(user2)
        assertEquals(user1, user2)
        var (userName , userAge) = user1
        println("userName = $userName userAge = $userAge")
    }
}