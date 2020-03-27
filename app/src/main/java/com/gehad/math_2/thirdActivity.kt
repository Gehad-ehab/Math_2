package com.gehad.math_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ListView

class thirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)


        val item = ArrayList<ItemClass>()

        item.add(ItemClass("First Year", "Algebra_1", R.drawable.mm4))
        item.add(ItemClass("Sec_Year", "Algebra_2", R.drawable.mm4))
        item.add(ItemClass("Third_Year", "Algebra_3", R.drawable.mm4))
        item.add(ItemClass("Forth_Year", "Algebra_4", R.drawable.mm4))
        item.add(ItemClass("Fifth_Year", "Algebra_5", R.drawable.mm4))


        val adaptor = ItemAdaptor(this@thirdActivity, item)

        val list = findViewById<ListView>(R.id.list_view)

        list.adapter = adaptor

        list.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->


            var intent = Intent(this@thirdActivity, forth_Activity1::class.java)
            startActivity(intent)
        }
    }
}
