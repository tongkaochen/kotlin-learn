package com.tifone.learn.kotlin

import kotlin.reflect.KProperty

class Delegate {
    var name: String = ""
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        val className = thisRef.toString().substringBefore("@")
        println("${className}.get is called")
        return name
    }
    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        val className = thisRef.toString().substringBefore("@")
        println("${className}.set is called")
        name = value
    }
}