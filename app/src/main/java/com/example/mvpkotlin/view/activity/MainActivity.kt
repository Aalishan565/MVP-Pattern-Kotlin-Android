package com.example.mvpkotlin.view.activity

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.mvpkotlin.R
import com.example.mvpkotlin.presenter.LoginPresenterImpl
import com.example.mvpkotlin.view.listener.LoginResultListener

class MainActivity : AppCompatActivity(), LoginResultListener {
    //declaration of the views
    private lateinit var etUserName: EditText
    private lateinit var etPassword: EditText
    private lateinit var btnLogin: Button
    private lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initUI()
    }

    private fun initUI() {
        //Binding the xml with kotlin code
        etUserName = findViewById(R.id.etUserName)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)
        tvResult = findViewById(R.id.tvResult)
        //btn click listener
        btnLogin.setOnClickListener {
            //Creating the object of presenter and passing reference of login result listener
            var presenter = LoginPresenterImpl(this)
            // passing user name and password to login model by do login method
            presenter.doLogin(etUserName.text.toString(), etPassword.text.toString())
        }
    }

    override fun onSuccess(result: String) {
        tvResult.text = result
    }

    override fun onFail(errorMessage: String) {
        tvResult.text = errorMessage
    }

}
