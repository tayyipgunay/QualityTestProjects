package test_project.lifecycle

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class Test_L1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val label = TextView(this)
        setContentView(label)

        GlobalScope.launch {
            delay(2000)
            runOnUiThread { label.text = "Finished" }
        }
    }
}
