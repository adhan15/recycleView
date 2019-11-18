package com.adhan.recyclerview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.LinearLayout.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerview=findViewById(R.id.recyclerView) as RecyclerView

        recyclerview.layoutManager=LinearLayoutManager(this,LinearLayout.VERTICAL,false)

        val users=ArrayList<User>()

        users.add(User("Adhan omar","Nairobi Kenya"))
        users.add(User("Mike James","Mombasa Kenya"))
        users.add(User("Felix Thomas","Machakos Kenya"))
        users.add(User("Noor Ahmed","Nakuru Kenya"))
        users.add(User("Alex Frank","Kisumu Kenya"))

        val adapter=CustomAdapter(users)

        recyclerview.adapter=adapter

    }
}
