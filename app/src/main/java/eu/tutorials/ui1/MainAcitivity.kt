package eu.tutorials.ui1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() { // Corrected the class name to MainActivity
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.Registerhere)

        button.setOnClickListener {
            // Create an Intent to navigate to your target activity
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
        val button1: Button = findViewById(R.id.Loginhere)

        button1.setOnClickListener {
            // Create an Intent to navigate to your target activity
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
