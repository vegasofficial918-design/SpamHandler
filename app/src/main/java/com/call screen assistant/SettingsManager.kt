package com.callscreenassistant

import android.content.Context

class SettingsManager(context: Context) {

    private val prefs =
        context.getSharedPreferences("settings", Context.MODE_PRIVATE)

    fun screeningEnabled(): Boolean =
        prefs.getBoolean("enabled", true)

    fun setScreeningEnabled(enabled: Boolean) {
        prefs.edit().putBoolean("enabled", enabled).apply()
    }
}
