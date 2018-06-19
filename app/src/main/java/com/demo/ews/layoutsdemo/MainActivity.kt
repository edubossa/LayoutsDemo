package com.demo.ews.layoutsdemo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val demo01 = findViewById<Button>(R.id.demo_01)
        val demo02 = findViewById<Button>(R.id.demo_02)

        demo01.setOnClickListener(View.OnClickListener {
            //Toast.makeText(this, "Action DEMO 01!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, Demo01Activity::class.java)
            intent.putExtra("PARAM01", "EWS09898237897")
            startActivity(intent)

        })

        demo02.setOnClickListener(View.OnClickListener {
            Toast.makeText(this, "Action DEMO 02!", Toast.LENGTH_SHORT).show()
        })

    }
}
