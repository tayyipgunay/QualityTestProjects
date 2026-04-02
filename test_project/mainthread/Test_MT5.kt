package test_project.mainthread

import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Test_MT5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        repeat(5000) {
            BitmapFactory.decodeResource(resources, android.R.drawable.ic_menu_gallery)
        }
    }
}
