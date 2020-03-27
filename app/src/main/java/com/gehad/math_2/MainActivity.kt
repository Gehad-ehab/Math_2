package com.gehad.math_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val title1 = findViewById<TextView>(R.id.title1)
        var user_email = findViewById<EditText>(R.id.user_email)
        var user_name = findViewById<EditText>(R.id.user_email)
        var sign_in = findViewById<Button>(R.id.sign)
        var register = findViewById<Button>(R.id.registe)

        sign_in.setOnClickListener(){

            var intent = Intent( this@MainActivity , secActivity::class.java)
            startActivity(intent)

        }

        register.setOnClickListener(){

            var intent = Intent( this@MainActivity , secActivity::class.java)
            startActivity(intent)

        }
    }

}
