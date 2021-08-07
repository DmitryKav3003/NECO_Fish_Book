package com.example.necofishbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    var nav_view:NavigationView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nav_view = findViewById(R.id.nav_view)

        nav_view?.setNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.id_fish -> Toast.makeText(this,"эта рыба", Toast.LENGTH_SHORT).show()
            R.id.id_na -> Toast.makeText(this,"эта наживка", Toast.LENGTH_SHORT).show()
            R.id.id_sna -> Toast.makeText(this,"эта снасть", Toast.LENGTH_SHORT).show()
            R.id.id_story -> Toast.makeText(this,"эта история", Toast.LENGTH_SHORT).show()
        }


        return true
    }
}