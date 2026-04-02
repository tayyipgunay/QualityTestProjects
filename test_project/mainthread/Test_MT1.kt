package test_project.mainthread

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Test_MT1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.sleep(3000)
    }
}
