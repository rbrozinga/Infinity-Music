package com.example.infinitymusic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.FragmentContainerView
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        supportActionBar?.hide()

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.nav)
        val navController = supportFragmentManager.findFragmentById(R.id.fragmentContainerView)?.findNavController()
        navController?.let { bottomNavigationView.setupWithNavController(it) }


        val appBarConfiguration = AppBarConfiguration(setOf(R.id.homeFragment, R.id.searchFragment, R.id.listFragment))
        if (navController != null) {
            setupActionBarWithNavController(navController, appBarConfiguration)
        }

        if (navController != null) {
            bottomNavigationView.setupWithNavController(navController)
        }
       }
}