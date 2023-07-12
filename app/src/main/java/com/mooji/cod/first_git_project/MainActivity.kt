package com.mooji.cod.first_git_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        android.widget.Toast.makeText(this, "iam in develop branch", Toast.LENGTH_SHORT).show()
    }
}