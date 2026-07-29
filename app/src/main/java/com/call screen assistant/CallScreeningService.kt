package com.callscreenassistant

import android.telecom.Call
import android.telecom.CallScreeningService

NotificationHelper.show(
    this,
    "Incoming Call",
    "An incoming call was screened."
)

class CallScreenService : CallScreeningService() {

    override fun onScreenCall(callDetails: Call.Details) {

        val response = CallResponse.Builder()

        // Allow the call to continue.
        // You can add your own screening logic here.
        response
            .setDisallowCall(false)
            .setRejectCall(false)
            .setSkipCallLog(false)
            .setSkipNotification(false)

        respondToCall(callDetails, response.build())
    }
}
