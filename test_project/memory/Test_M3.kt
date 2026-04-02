package test_project.memory

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Test_M3 : AppCompatActivity() {
    companion object {
        var cachedView: View? = null
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view = View(this)
        setContentView(view)
        cachedView = view
    }
}
