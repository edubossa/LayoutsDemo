package com.demo.ews.layoutsdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.demo.ews.layoutsdemo.model.Email

class Demo01Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo01)

        val param01 = intent.getStringExtra("PARAM01")
        println(param01)

        val sendButton = findViewById<Button>(R.id.btSend)
        sendButton.setOnClickListener(View.OnClickListener {
            val to = findViewById<EditText>(R.id.etTo)
            val subject = findViewById<EditText>(R.id.etSubject)
            val message = findViewById<EditText>(R.id.etMessage)

            println(to.text.toString())
            val email = Email(to.text.toString(), subject.text.toString(), message.text.toString())
            println(email)
            Toast.makeText(this, email.toString(), Toast.LENGTH_LONG).show()
        })


    }
}
