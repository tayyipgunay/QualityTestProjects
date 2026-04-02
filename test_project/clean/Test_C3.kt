package test_project.clean

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

object AppRefs {
    var appContext: Context? = null
}

class Test_C3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppRefs.appContext = applicationContext
    }
}
