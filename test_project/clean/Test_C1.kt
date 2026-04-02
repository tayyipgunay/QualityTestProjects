package test_project.clean

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class Test_C1 : AppCompatActivity() {
    private val state = MutableStateFlow("Ready")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val label = TextView(this)
        setContentView(label)
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                state.collect { label.text = it }
            }
        }
    }
}
