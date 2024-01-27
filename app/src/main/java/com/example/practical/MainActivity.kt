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
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import com.example.practical.databinding.ActivityMainBinding
import java.util.Collections

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addImage = findViewById<Button>(R.id.btnAddImage)
        val ivImage = findViewById<ImageView>(R.id.ivImage)
        addImage.setOnClickListener {
            //ivImage.setImageResource(R.drawable.frog1)
            Log.d("Activity", "This is github example")
        }


    }
}