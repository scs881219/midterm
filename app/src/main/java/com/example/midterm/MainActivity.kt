package com.example.midterm

import android.app.Activity
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.midterm.R
import com.example.midterm.databinding.ActivityMainBinding
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.button.setOnClickListener {
            add(it)
            binding.editTextTextPersonName2.clearFocus()
        }
        binding.button2.setOnClickListener {
            sub(it)
            binding.editTextTextPersonName2.clearFocus()
        }
        binding.button3.setOnClickListener {
            mul(it)
            binding.editTextTextPersonName2.clearFocus()
        }
        binding.button4.setOnClickListener {
            div(it)
            binding.editTextTextPersonName2.clearFocus()
        }

    }

    private fun add(view: View){
        var input:Float = binding.editTextTextPersonName2.text.toString().toFloat()
        var input2:Float = binding.editTextTextPersonName3.text.toString().toFloat()

        val formatter = DecimalFormat("#,###.##")

        input = input+input2

        val output = formatter.format(input)

        binding.textView.text = output.toString()

        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }

    private fun sub(view: View){
        var input:Float = binding.editTextTextPersonName2.text.toString().toFloat()
        var input2:Float = binding.editTextTextPersonName3.text.toString().toFloat()

        val formatter = DecimalFormat("#,###.##")

        input = input-input2

        val output = formatter.format(input)

        binding.textView.text = output.toString()

        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }

    private fun mul(view: View){
        var input:Float = binding.editTextTextPersonName2.text.toString().toFloat()
        var input2:Float = binding.editTextTextPersonName3.text.toString().toFloat()

        val formatter = DecimalFormat("#,###.##")

        input = input*input2

        val output = formatter.format(input)

        binding.textView.text = output.toString()

        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }

    private fun div(view: View){
        var input:Float = binding.editTextTextPersonName2.text.toString().toFloat()
        var input2:Float = binding.editTextTextPersonName3.text.toString().toFloat()

        val formatter = DecimalFormat("#,###.##")

        input = input/input2

        val output = formatter.format(input)

        binding.textView.text = output.toString()

        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }

}