package com.example.loginmvpkotlin

class PresenterImpl(var loginView: LoginViewListener) : LoginPresenter {
    override fun doLogin(userName: String) {
        if (userName.equals("Aalishan", ignoreCase = true)) {
            loginView.success(userName)

        }

        loginView.failure("wrong input")

    }
}