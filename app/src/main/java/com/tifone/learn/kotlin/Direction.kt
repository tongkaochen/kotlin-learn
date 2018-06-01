package com.tifone.learn.kotlin

enum class Direction private constructor(value: Int) {
    NORTH(1), SOUTH(2), WEST(3), EAST(5);

    var mValue: Int = value

    override fun toString(): String {
        return mValue.toString()
    }
}