package com.nadillla.week2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textWelcomeUser.text=intent.getStringExtra("user")

        btnKalkulator.setOnClickListener {
            val intent = Intent(this,KalkulatorActivity::class.java)
            startActivity(intent)
        }

        btnList.setOnClickListener {
            val intent = Intent(this, ListActivity::class.java )
            startActivity(intent)
        }




    }
}