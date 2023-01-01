package com.example.myfirstkmmapp

class Greeting {
    private val platform: Platform = getPlatform()

    fun greeting(): String {
        return "Guess what it is! > ${platform.name}!"
    }
}