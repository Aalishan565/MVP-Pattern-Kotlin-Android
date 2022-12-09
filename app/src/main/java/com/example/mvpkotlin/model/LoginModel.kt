package com.example.mvpkotlin.model

class LoginModel() {

    fun doLogin(userName: String, password: String) = userName == "Aalishan" && password == "12345"
}