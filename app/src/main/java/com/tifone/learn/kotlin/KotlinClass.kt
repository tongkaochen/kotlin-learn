package com.tifone.learn.kotlin

class KotlinClass(className: String) {
    var name = className
    val summary: String
        get() = "I am KotlinClass"
    var keyValue = 100
    var key: Int = 100
        set(value) {
            println("value is set to $value")
            field = value
        }

    init {
        println(className)
    }

    constructor(value: Int, type: String) : this(type) {
        println("vaule = $value")
        println("type = $type")
    }

    // 单例模式的实现
    class Singleton private constructor() {
        public var value: Singleton? = null

        private object mHolder {
            val INSTANCE = Singleton()
        }

        companion object Factory {
            fun getInstance(): Singleton {
                return mHolder.INSTANCE
            }
        }
    }

    object InnerHolder {
        val value: Int = 100
        fun getValueForHolder(): Int {
            return value
        }
    }

    class Utils {
        // 修饰静态方法
        companion object {
            var position: Int = 100
            fun getPositionForUtils(): Int {
                return position
            }
        }
    }

    fun call() {
        var value = InnerHolder.value
        InnerHolder.getValueForHolder()
        var position = Utils.position
        Utils.getPositionForUtils()
    }

    fun main(args: Array<String>) {
        println("main: " + args[0])
    }
    fun doSomething(url: String, category: String = "http", type: Int = 0) {
        println("url = $url")
        println("category = $category")
        println("type = $type")
    }
    fun addName(vararg names: String) {
        for (name in names) {
            println(name)
        }
    }
}

fun globalFunction(value: Int = 100): Int {
    return value
}

// 与globalFunction功能一致，只是简化的写法
fun globalFunction2(value: Int = 100): Int = value

fun globalFunction3(value: Int = 100) = println(value)