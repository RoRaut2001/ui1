package eu.tutorials.ui1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ProfileActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val button: Button = findViewById(R.id.checkinbutton)

        button.setOnClickListener {
            val intent = Intent(this, CheckInActivity::class.java)
            startActivity(intent)
        }

        val button1: Button = findViewById(R.id.checkoutbutton)

        button1.setOnClickListener {
            val intent = Intent(this, CheckOutActivity::class.java)
            startActivity(intent)
        }


        val floatingActionButton: FloatingActionButton = findViewById(R.id.backtohome)

        floatingActionButton.setOnClickListener {
            // Create an Intent to navigate to the LoginActivity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


    }
}