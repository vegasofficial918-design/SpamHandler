package com.callscreenassistant

import android.telecom.Call
import android.telecom.CallScreeningService

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
