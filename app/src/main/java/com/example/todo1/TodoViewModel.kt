package com.example.todo1

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TodoViewModel : ViewModel() {
    private var _todolist = MutableLiveData<List<Todo>>()
    val todolist: LiveData<List<Todo>> = _todolist

    fun getAllTodos() {
        _todolist.value = TodoManager.getAllTodos().reversed()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun addTodo(item: String) {
        TodoManager.addTodo(item)
        getAllTodos()
    }

    fun deleteTodo(i: Int) {
        TodoManager.deleteTodo(i)
        getAllTodos()
    }
}