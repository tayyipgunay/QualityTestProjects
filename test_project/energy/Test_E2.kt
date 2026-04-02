package test_project.energy

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class Test_E2 : AppCompatActivity() {
    private val handler = Handler(Looper.getMainLooper())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        handler.post(object : Runnable {
            override fun run() {
                contentResolver.query(android.provider.CallLog.Calls.CONTENT_URI, null, null, null, null)
                handler.postDelayed(this, 500)
            }
        })
    }
}
