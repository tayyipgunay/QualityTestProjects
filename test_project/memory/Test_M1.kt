package test_project.memory

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

object SessionHolder {
    var context: Context? = null
}

class Test_M1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        SessionHolder.context = this
    }
}
