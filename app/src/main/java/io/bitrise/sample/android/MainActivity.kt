package io.bitrise.sample.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.cta_do_nothing).setOnClickListener {
            Toast.makeText(this, "Why I\'m doing nothing ?", Toast.LENGTH_SHORT).show()
        }
    }
}
