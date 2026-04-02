package test_project.clean

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import kotlinx.coroutines.delay

class Test_C5(context: Context, params: WorkerParameters) : CoroutineWorker(context, params) {
    override suspend fun doWork(): Result {
        repeat(20) {
            if (isStopped) return Result.failure()
            delay(200)
        }
        return Result.success()
    }
}
