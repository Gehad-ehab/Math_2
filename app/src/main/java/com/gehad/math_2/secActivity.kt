package com.gehad.math_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView

class secActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sec)

        var desc = findViewById<TextView>(R.id.desc)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        val inflator = menuInflater

        inflator.inflate(R.menu.main_menu,menu)

        return true


    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){

            R.id.uni  ->{

                var intent = Intent( this@secActivity , thirdActivity::class.java)
                startActivity(intent)
                return true
            }

            R.id.prep  ->{

                var intent = Intent( this@secActivity , thirdActivity::class.java)
                startActivity(intent)
                    return true
            }

            R.id.sec  ->{

                var intent = Intent( this@secActivity , thirdActivity::class.java)
                startActivity(intent)
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
