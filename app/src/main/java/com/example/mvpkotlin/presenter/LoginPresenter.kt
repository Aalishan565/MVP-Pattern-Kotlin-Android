package com.example.mvpkotlin.presenter

@FunctionalInterface
interface LoginPresenter {
    fun doLogin(userName: String, password: String)
}