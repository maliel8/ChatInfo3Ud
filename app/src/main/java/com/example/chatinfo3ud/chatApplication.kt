package com.example.chatinfo3ud

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate
// cette classe permet de desactiver le mode night du telephone de l'utilisateur
class chatApplication:Application() {
    override fun onCreate() {
        super.onCreate()
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
    }
}