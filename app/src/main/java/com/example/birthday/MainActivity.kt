package com.example.birthday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var edittext1: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edittext1=findViewById(R.id.edittext1)

    }
    fun createBirthdaycard(view: View){


        val name = edittext1.editableText.toString()

        val intent=Intent(this,Activity2::class.java)
        intent.putExtra(Activity2.NAME_EXTRA,name)
        startActivity(intent)
    }
}