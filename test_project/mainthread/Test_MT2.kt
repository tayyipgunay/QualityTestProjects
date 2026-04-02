package test_project.mainthread

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.net.URL

class Test_MT2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        URL("https://example.com").readText()
    }
}
