package com.example.loginmvpkotlin

interface LoginViewListener {
    fun success(result:String)
    fun failure(message:String)
}