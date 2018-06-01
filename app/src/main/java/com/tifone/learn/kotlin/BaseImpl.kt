package com.tifone.learn.kotlin

class BaseImpl(var x: Int) : Base {
    override fun print() {
        print(x)
    }
}