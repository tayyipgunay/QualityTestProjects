package test_project.memory

import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class LongLivedManager {
    var activity: Activity? = null
}

class Test_M2 : AppCompatActivity() {
    private val manager = LongLivedManager()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        manager.activity = this
    }
}
