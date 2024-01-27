package com.example.practical

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
import com.example.practical.databinding.ActivityMainBinding
import java.util.Collections

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnOrder = findViewById<Button>(R.id.btnOrder)
        btnOrder.setOnClickListener {
            val rgoMeat = findViewById<RadioGroup>(R.id.rgMeat)
            val checkedMeatRadioButtonId = rgoMeat.checkedRadioButtonId
            val meat = findViewById<RadioButton>(checkedMeatRadioButtonId)
            val cheese = findViewById<CheckBox>(R.id.cbCheese).isChecked
            val onion = findViewById<CheckBox>(R.id.cbOnions).isChecked
            val salad = findViewById<CheckBox>(R.id.cbSalad).isChecked
            val orderString = "You ordered a burger with: \n" +
                "${meat.text}" +
                (if (cheese) "\nCheese" else "") +
                (if (onion) "\nOnion" else "")  +
                (if (salad) "\nSalad" else "")

            val tvOrder = findViewById<TextView>(R.id.tvOrder)
            tvOrder.text = orderString
        }


    }
}