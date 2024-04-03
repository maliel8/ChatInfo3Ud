package com.example.chatinfo3ud.activities

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.chatinfo3ud.R

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }
// gestion de la bare de menu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_home,menu)
        return super.onCreateOptionsMenu(menu)
    }
    
// gestion des click sur les icon des menu
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.itemLogout){

            Intent(this,AuthentificationActivity::class.java).also{
                startActivity(it)
            }
            finish()
        }
        if (item.itemId == R.id.itemSettings){
           Toast.makeText(this,"settings button is clicked",Toast.LENGTH_LONG).show()
            /* Intent(this,SettingsActivity::class.java).also {
                startActivity(it)
            }*/
        }
        return super.onOptionsItemSelected(item)
    }
}