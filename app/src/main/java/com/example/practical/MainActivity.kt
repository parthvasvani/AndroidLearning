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
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.app.TaskStackBuilder
import android.content.Context
import android.graphics.Color
import android.os.Build
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.Tab
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStartService = findViewById<Button>(R.id.btnStartService)
        val tvServiceInfo = findViewById<TextView>(R.id.tvServiceInfo)
        btnStartService.setOnClickListener {
            Intent(this,MyService::class.java).also {
                startService(it)
                tvServiceInfo.text = "Service Running"
            }
        }

        val btnStopService = findViewById<Button>(R.id.btnStopService)
        btnStopService.setOnClickListener {
            Intent(this,MyService::class.java).also {
                stopService(it)
                tvServiceInfo.text = "Service Stopped"
            }
        }

        val btnSendData = findViewById<Button>(R.id.btnSendData)
        btnSendData.setOnClickListener {
            Intent(this,MyService::class.java).also {
                val etData = findViewById<EditText>(R.id.etData)
                val dataString = etData.text.toString()
                it.putExtra("EXTRA DATA",dataString)
                startService(it)

            }
        }
     }
}





