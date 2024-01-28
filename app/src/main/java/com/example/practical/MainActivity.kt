package com.example.practical

import android.app.Person
import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import com.example.practical.databinding.ActivityMainBinding
import java.util.Collections

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnApply = findViewById<Button>(R.id.btApply)
        btnApply.setOnClickListener {
            var name = findViewById<EditText>(R.id.etName).text.toString()
            var age = findViewById<EditText>(R.id.etAge).text.toString().toInt()
            var country = findViewById<EditText>(R.id.etCountry).text.toString()
            val person = Person(name, age, country)
            Intent(this,SecondActivity::class.java).also {
                it.putExtra("EXTRA_PERSON", person)
                //it.putExtra("EXTRA_NAME",name)
                //it.putExtra("EXTRA_AGE",age)
                //it.putExtra("EXTRA_COUNTRY",country)
                startActivity(it)
            }
        }
    }
}