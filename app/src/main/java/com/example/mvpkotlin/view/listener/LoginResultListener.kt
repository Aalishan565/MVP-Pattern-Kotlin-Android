package com.example.mvpkotlin.view.listener

interface LoginResultListener {
    fun onSuccess(result: String)
    fun onFail(errorMessage: String)
}