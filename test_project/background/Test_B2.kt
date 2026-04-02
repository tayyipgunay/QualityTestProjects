package test_project.background

import android.app.Service
import android.content.Intent
import android.os.IBinder

class Test_B2 : Service() {
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Thread {
            while (true) {
                Thread.sleep(1000)
            }
        }.start()
        return START_STICKY
    }

    override fun onBind(intent: Intent?): IBinder? = null
}
