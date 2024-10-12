package com.example.todo1

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.Instant
import java.util.Date

object TodoManager {
    private val todoList = mutableListOf<Todo>()
    fun getAllTodos(): List<Todo> {
        return todoList
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun addTodo(item: String) {
        todoList.add(
            Todo(System.currentTimeMillis().toInt(), item, Date.from(Instant.now()))
        )

    }

    fun deleteTodo(id: Int) {
        todoList.removeIf { it.id == id }
    }

}