package com.cristiangarrido.example.myapplication

import android.content.ComponentName
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startActivity(Intent().setComponent(ComponentName(this, "com.cristiangarrido.example.dynamicfeature.DynamicFeatureActivity")))
    }
}