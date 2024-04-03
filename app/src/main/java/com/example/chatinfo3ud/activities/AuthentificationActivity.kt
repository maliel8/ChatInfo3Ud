package com.example.chatinfo3ud.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.chatinfo3ud.R
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputLayout

class AuthentificationActivity : AppCompatActivity() {

    lateinit var tvRegister:TextView
    lateinit var btConnected:MaterialButton
    lateinit var lyTvPassword:TextInputLayout
    lateinit var lyTvMatricule:TextInputLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authentification)

            tvRegister = findViewById(R.id.tvRegister)
            btConnected = findViewById(R.id.btConnected)
            lyTvPassword = findViewById(R.id.lyTvPassword)
            lyTvMatricule = findViewById(R.id.lyTvMatricule)

            tvRegister.setOnClickListener{
                Intent(this,RegisterActivity::class.java).also{
                    startActivity(it)
                }
            }

            btConnected.setOnClickListener {

                val matricule = lyTvMatricule.editText?.text.toString()
                val password = lyTvPassword.editText?.text.toString()

                lyTvMatricule.isErrorEnabled=false
                lyTvPassword.isErrorEnabled=false

                if (matricule.isEmpty() || password.isEmpty())
                {
                    if (matricule.isEmpty()) {
                        lyTvMatricule.error = "registration number is required "
                        lyTvMatricule.isErrorEnabled=true
                    }
                    if (password.isEmpty()){
                        lyTvPassword.error="password is required"
                        lyTvPassword.isErrorEnabled=true
                    }
                } else {
                    signIn(matricule,password)
                }
            }
    }

    fun signIn(matricule:String,Password:String){
        Log.d("sigIn", "signIn: user ....... ")
        if (matricule == "20S42658" && Password == "2001") {
            Intent(this, HomeActivity::class.java).also {
                startActivity(it)
            }
            finish()
        }else
        {
            lyTvPassword.error="Authentication is failed"
            lyTvMatricule.error=" "
            lyTvMatricule.isErrorEnabled=true
            lyTvPassword.isErrorEnabled=true

        }
    }
}