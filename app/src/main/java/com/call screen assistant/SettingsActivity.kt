package com.callscreenassistant

import android.os.Bundle
import android.widget.Switch
import androidx.appcompat.app.AppCompatActivity

class SettingsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_settings)

        val screeningSwitch = findViewById<Switch>(R.id.screeningSwitch)

        screeningSwitch.isChecked = true
    }
}
