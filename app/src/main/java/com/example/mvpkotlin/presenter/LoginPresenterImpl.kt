package com.example.mvpkotlin.presenter

import android.text.TextUtils
import com.example.mvpkotlin.model.LoginModel
import com.example.mvpkotlin.view.listener.LoginResultListener

/**
 * Created by Aalishan Ansari on 09/12/22.
 */
class LoginPresenterImpl(private val loginResultListener: LoginResultListener) : LoginPresenter {

    private val loginModel: LoginModel = LoginModel()

    override fun doLogin(userName: String, password: String) {
        return if (TextUtils.isEmpty(userName)) {
            loginResultListener.onFail("Please provide user name")
        } else if (TextUtils.isEmpty(password)) {
            loginResultListener.onFail("Please provide password name")
        } else {
            if (loginModel.doLogin(userName, password)) {
                loginResultListener.onSuccess("Successfully logged in")
            } else {
                loginResultListener.onFail("Please provide correct credentials")
            }
        }

    }
}