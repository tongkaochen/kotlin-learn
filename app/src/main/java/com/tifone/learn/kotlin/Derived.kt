package com.tifone.learn.kotlin

class Derived(base: Base) : Base by base {
    fun getName(): String {
        return "Bill"
    }
}