package com.nadillla.week2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(),View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogin.setOnClickListener(this)


    }

    override fun onClick(v: View) {

        var username = edUsername.text.toString().trim()
        var passwd = edPassword.text.toString().trim()

        if(v.id == R.id.btnLogin){

            if(username.isEmpty()||passwd.isEmpty()){
                Toast.makeText(this,"Username and Password can't be empty", Toast.LENGTH_SHORT).show()

            }else{
                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra("user", edUsername.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}