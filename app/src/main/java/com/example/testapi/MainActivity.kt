package com.example.testapi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapp.ui.UserFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, UserFragment())
                .commit()
        }
    }
}
