package eu.tutorials.ui1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class RegisterActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register2)

        val floatingActionButton: FloatingActionButton = findViewById(R.id.backtohome)

        floatingActionButton.setOnClickListener {
            // Create an Intent to navigate to the LoginActivity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val textView: TextView = findViewById(R.id.backtologin)

        textView.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }


    }
}