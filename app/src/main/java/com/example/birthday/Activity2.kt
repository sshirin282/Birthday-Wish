package com.example.birthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Activity2 : AppCompatActivity() {
    lateinit var textview:TextView
    lateinit var textview1:TextView

companion object{
const val NAME_EXTRA="name_extra"
}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        textview=findViewById(R.id.birthdayGreeting)
        textview1=findViewById(R.id.birthdayGreeting2)

        val name= intent.getStringExtra(NAME_EXTRA)
        textview.text = "HAPPY BIRTHDAY TO\n$name!"
        textview1.text="From Shirin"
    }
}