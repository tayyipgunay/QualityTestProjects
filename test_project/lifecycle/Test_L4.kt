package test_project.lifecycle

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.MutableLiveData

class Test_L4 : AppCompatActivity() {
    private val message = MutableLiveData("Start")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val label = TextView(this)
        setContentView(label)

        message.observeForever { value ->
            label.text = value
        }
    }
}
