package test_project.background

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class Test_B6 : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        val result = goAsync()
        Thread {
            Thread.sleep(30_000)
        }.start()
    }
}
