package com.example.demoapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var username: EditText
    private lateinit var password: EditText
    private lateinit var submit: Button

    private lateinit var cart: Button
    private lateinit var checkout: Button
    private lateinit var offlineBanner: TextView
    private lateinit var success: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Use the merged layout that contains login + checkout
        setContentView(R.layout.activity_main)

        // Login section
        username = findViewById(R.id.username)
        password = findViewById(R.id.password)
        submit = findViewById(R.id.submit)

        submit.setOnClickListener {
            val user = username.text.toString()
            val pass = password.text.toString()
            if (user.isNotEmpty() && pass.isNotEmpty()) {
                Toast.makeText(this, "Login successful: $user", Toast.LENGTH_SHORT).show()
                success.visibility = View.VISIBLE
                success.text = "Login successful!"
                offlineBanner.visibility = View.INVISIBLE
            } else {
                Toast.makeText(this, "Please enter credentials", Toast.LENGTH_SHORT).show()
                offlineBanner.visibility = View.VISIBLE
                offlineBanner.text = "Please enter credentials"
                success.visibility = View.INVISIBLE
            }
        }

        // Checkout section
        cart = findViewById(R.id.cart)
        checkout = findViewById(R.id.checkout)
        offlineBanner = findViewById(R.id.offlineBanner)
        success = findViewById(R.id.success)

        cart.setOnClickListener {
            success.visibility = View.INVISIBLE
            offlineBanner.visibility = View.INVISIBLE
        }

        checkout.setOnClickListener {
            success.visibility = View.VISIBLE
            success.text = "Checkout Success!"
            offlineBanner.visibility = View.INVISIBLE
        }
    }

    // Simulated chaos triggers
    fun simulateNetworkDrop() {
        offlineBanner.visibility = View.VISIBLE
        offlineBanner.text = "Offline"
        success.visibility = View.INVISIBLE
    }

    fun simulateNetworkRestore() {
        offlineBanner.visibility = View.INVISIBLE
        success.visibility = View.VISIBLE
        success.text = "Checkout Success!"
    }
}