package com.example.practical

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        val person = intent.getSerializableExtra("EXTRA_PERSON") as Person
        var name = intent.getStringExtra("EXTRA_NAME")
        var age = intent.getIntExtra("EXTRA_AGE",0)
        var country = intent.getStringExtra("EXTRA_COUNTRY")
        //var personString = "$name is $age years old lives in $country"
        var tvPerson = findViewById<TextView>(R.id.tvPerson)
        tvPerson.text = person.toString()

    }
}