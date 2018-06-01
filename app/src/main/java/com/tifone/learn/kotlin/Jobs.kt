package com.tifone.learn.kotlin

abstract class Jobs(jobsName: String) {
    private var name = jobsName
    fun getJobsName(): String = name
    abstract fun getAddress(): String
}