package test_project.background

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.util.concurrent.Executors

class Test_B4 : AppCompatActivity() {
    private val executor = Executors.newSingleThreadExecutor()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        executor.submit {
            Thread.sleep(120_000)
        }
    }
}
