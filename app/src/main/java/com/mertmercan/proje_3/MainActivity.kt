package com.mertmercan.proje_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mertmercan.proje_3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val numone = 15
        val numtwo = 20
        val numthree = 35

        if (numone > numtwo && numtwo>numthree){
            println("${numone}>${numtwo}>${numthree}")
        }
        if (numone > numtwo && numthree>numtwo){
            println("${numone}>${numthree}>${numtwo}")
        }
        if (numtwo > numone && numone>numthree){
            println("${numtwo}>${numone}>${numthree}")
        }
        if (numtwo > numthree && numthree>numtwo){
            println("${numtwo}>${numthree}>${numtwo}")
        }
        if (numthree > numone && numone>numtwo){
            println("${numthree}>${numone}>${numtwo}")
        }else{
            println("${numthree}>${numtwo}>${numone}")
        }
    }
}