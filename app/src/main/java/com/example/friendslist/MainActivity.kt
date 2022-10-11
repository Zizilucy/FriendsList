package com.example.friendslist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    private val name = arrayOf("Hillary", "Emmanuel", "Ify", "Juliet", "Ifeanyi", "Jane", "Nora", "Uche", "Chioma", "Chidiogo", "Amaka")

    private val image = arrayOf(R.drawable.hillary, R.drawable.emmanuel, R.drawable.ify, R.drawable.juliet, R.drawable.ifeanyi, R.drawable.jane, R.drawable.nora, R.drawable.uche, R.drawable.chioma, R.drawable.chidiogo, R.drawable.amaka)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<ListView>(R.id.list_view).adapter = ListAdapter(this, image, name)
    }
}