package com.example.mvpkotlin.model

import com.example.mvpkotlin.presenter.LoginPresenter
import com.example.mvpkotlin.view.listener.LoginResultListener

class LoginModel(var loginResult: LoginResultListener) : LoginPresenter {

    override fun doLogin(userName: String, password: String) {
        if (userName == "Aalishan" && password == "12345") {
            loginResult.onSuccess("Login Success Welcome $userName")
        } else {
            loginResult.onFail("Provided credentials are wrong")
        }

    }
}