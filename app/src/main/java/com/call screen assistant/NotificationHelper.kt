package com.callscreenassistant

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import androidx.core.app.NotificationCompat

object NotificationHelper {

    private const val CHANNEL = "screened_calls"

    fun show(context: Context, title: String, message: String) {

        val manager =
            context.getSystemService(NotificationManager::class.java)

        manager.createNotificationChannel(
            NotificationChannel(
                CHANNEL,
                "Screened Calls",
                NotificationManager.IMPORTANCE_DEFAULT
            )
        )

        val notification =
            NotificationCompat.Builder(context, CHANNEL)
                .setSmallIcon(android.R.drawable.sym_call_incoming)
                .setContentTitle(title)
                .setContentText(message)
                .build()

        manager.notify(System.currentTimeMillis().toInt(), notification)
    }
}
