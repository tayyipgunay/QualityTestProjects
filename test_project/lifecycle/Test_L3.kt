package test_project.lifecycle

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class Test_L3 : AppCompatActivity() {
    private val statusFlow = MutableStateFlow("Idle")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view = TextView(this)
        setContentView(view)

        lifecycleScope.launchWhenCreated {
            statusFlow.collect { view.text = it }
        }
    }
}
