package com.adefruandta.encryptedndk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(this, EncryptedNdk.apiToken(), Toast.LENGTH_LONG).show()
    }
}