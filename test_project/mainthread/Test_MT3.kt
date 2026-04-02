package test_project.mainthread

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Test_MT3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val list = mutableListOf<Int>()
        for (i in 0 until 8_000_000) {
            list.add(i * i)
        }
    }
}
