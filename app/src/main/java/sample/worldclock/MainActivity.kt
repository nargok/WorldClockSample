package sample.worldclock

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val timeZone = TimeZone.getDefault()

        val timeZoneView = findViewById<TextView>(R.id.timeZone)
        timeZoneView.text = timeZone.displayName

        val addButton = findViewById<Button>(R.id.add)
        addButton.setOnClickListener{
            val intent = Intent(this, TimeZoneSelectActivity::class.java)
            startActivityForResult(intent, 1)
        }
    }
}
