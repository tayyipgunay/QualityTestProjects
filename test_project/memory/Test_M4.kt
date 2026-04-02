package test_project.memory

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

object ClickStore {
    var listener: (() -> Unit)? = null
}

class Test_M4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val button = Button(this)
        setContentView(button)

        ClickStore.listener = { title = "Pressed" }
        button.setOnClickListener { ClickStore.listener?.invoke() }
    }
}
