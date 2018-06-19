package com.demo.ews.layoutsdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class Demo02Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo02)

        val btStart = findViewById<Button>(R.id.btStartService)
        val btPause = findViewById<Button>(R.id.btPausetService)
        val btStop = findViewById<Button>(R.id.btStopService)

        btStart.setOnClickListener(View.OnClickListener {
            Toast.makeText(this, "STARTED!", Toast.LENGTH_SHORT).show()
        })
        btPause.setOnClickListener(View.OnClickListener {
            Toast.makeText(this, "PAUSED!", Toast.LENGTH_SHORT).show()
        })
        btStop.setOnClickListener(View.OnClickListener {
            Toast.makeText(this, "STOPED!", Toast.LENGTH_SHORT).show()
        })


    }
}
