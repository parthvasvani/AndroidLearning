package com.example.practical

import android.app.Person
import android.content.Intent
import android.content.pm.PackageManager
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
import androidx.core.app.ActivityCompat
import com.example.practical.databinding.ActivityMainBinding
import java.util.Collections
import android.Manifest
import android.app.Activity
import android.app.AlertDialog

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addContactDialog = AlertDialog.Builder(this)
            .setTitle("Add Contact")
            .setMessage("Do you want to add Mr. Parth to your Contacts List")
            .setIcon(R.drawable.ic_add_contact)
            .setPositiveButton("Yes"){_,_ ->
                Toast.makeText(this,"You added Mr. Parth to your Contact List",Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("No"){_,_ ->
                Toast.makeText(this,"You didn't add Mr. Parth to your Contact List",Toast.LENGTH_SHORT).show()
            }.create()

        val btnDialog1 = findViewById<Button>(R.id.btnDialog1)
        btnDialog1.setOnClickListener {
            addContactDialog.show()
        }


        val options = arrayOf("First Item", "Second Item", "Third Item")
        val singleChoiceDialog = AlertDialog.Builder(this)
            .setTitle("Choose one of these options")
            .setSingleChoiceItems(options,0){dialogInterface, i ->
                Toast.makeText(this,"You clicked on ${options[i]}",Toast.LENGTH_SHORT).show()
            }
            .setPositiveButton("Accept"){_,_ ->
                Toast.makeText(this,"You accepted the SingleChoiceDialog",Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Decline"){_,_ ->
                Toast.makeText(this,"You declined the SingleChoiceDialog",Toast.LENGTH_SHORT).show()
            }.create()

        val btnDialog2 = findViewById<Button>(R.id.btnDialog2)
        btnDialog2.setOnClickListener {
            singleChoiceDialog.show()
        }

        val multipleChoiceDialog = AlertDialog.Builder(this)
            .setTitle("Choose one of these options")
            .setMultiChoiceItems(options, booleanArrayOf(false,false,false)){_,i,isChecked->
                if (isChecked){
                    Toast.makeText(this,"You checked options at ${options[i]}",Toast.LENGTH_SHORT).show()
                }else{
                    Toast.makeText(this,"You unchecked options at ${options[i]}",Toast.LENGTH_SHORT).show()
                }
            }
            .setPositiveButton("Accept"){_,_ ->
                Toast.makeText(this,"You accepted the MultiChoiceDialog",Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Decline"){_,_ ->
                Toast.makeText(this,"You declined the MultiChoiceDialog",Toast.LENGTH_SHORT).show()
            }.create()

        val btnDialog3 = findViewById<Button>(R.id.btnDialog3)
        btnDialog3.setOnClickListener {
            multipleChoiceDialog.show()
        }
    }
}