package com.example.databindingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.databinding.DataBindingUtil
import com.example.databindingdemo.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btnDisplay.setOnClickListener(){

            var p = Person("Ali", "12345","abc@gmail.com", "20 Jalan 123")
            binding.personDetail = p
        }

        binding.btnSecond.setOnClickListener(){
            var p = Person("Jason", "54321","123@gmail.com", "40 Jalan ABC")
            binding.personDetail = p
        }


    }
}