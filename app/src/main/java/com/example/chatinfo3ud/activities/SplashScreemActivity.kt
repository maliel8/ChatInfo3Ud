package com.example.chatinfo3ud.activities

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.chatinfo3ud.R

class SplashScreemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screem)

        // ajout d'un delait d'attente avant la redirection
        Handler(Looper.getMainLooper()).postDelayed({
            // redirection vers le homeActivity
            Intent(this,HomeActivity::class.java).also {
                startActivity(it)
            }
            finish()
        },3000)



    }
}