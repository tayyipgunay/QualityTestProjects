package test_project.mainthread

import android.database.sqlite.SQLiteDatabase
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Test_MT4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val db = SQLiteDatabase.openOrCreateDatabase(filesDir.path + "/tmp.db", null)
        repeat(20000) {
            db.execSQL("CREATE TABLE IF NOT EXISTS t$it (id INTEGER)")
        }
        db.close()
    }
}
