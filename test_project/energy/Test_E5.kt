package test_project.energy

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class Test_E5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        lifecycleScope.launch(Dispatchers.IO) {
            while (true) {
                contentResolver.query(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, null, null, null, null)
                delay(50)
            }
        }
    }
}
