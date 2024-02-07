package eu.tutorials.ui1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class CheckOutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_out)
        val floatingActionButton: FloatingActionButton = findViewById(R.id.backtohome)

        floatingActionButton.setOnClickListener {
            // Create an Intent to navigate to the LoginActivity
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

    }
}