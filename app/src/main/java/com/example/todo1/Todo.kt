package com.example.todo1

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.Instant
import java.util.Date

data class Todo(
    var id: Int,
    var text: String,
    var createdAt: Date
)


