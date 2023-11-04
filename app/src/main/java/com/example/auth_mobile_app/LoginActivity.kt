package com.example.auth_mobile_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import com.example.auth_mobile_app.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity(), View.OnClickListener,TextWatcher {
    private lateinit var bindingLogin: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingLogin = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(bindingLogin.root)
        bindingLogin.btnRegisterPage.setOnClickListener(this)
        bindingLogin.btnLogin.setOnClickListener(this)
        bindingLogin.btnForgetPassword.setOnClickListener(this)
        bindingLogin.checkboxLogin.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v!=null){
            when(v.id){
                R.id.btn_login->{

                }
                R.id.btn_forgetPassword->{

                }
                R.id.btn_registerPage->{
                    navigateGoToRegister()
                }
                R.id.checkbox_login->{

                }
            }
        }

    }

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

    }

    override fun afterTextChanged(s: Editable?) {

    }
    //============================================================
    /*this method this navigation go to register page*/
    private fun navigateGoToRegister(){
        startActivity(Intent(this@LoginActivity,RegisterActivity::class.java))
    }
    private fun navigateGoToHome(){
        startActivity(Intent(this@LoginActivity,HomeActivity::class.java))
    }
}