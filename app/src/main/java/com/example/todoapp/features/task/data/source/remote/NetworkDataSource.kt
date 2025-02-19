package com.example.todoapp.features.task.data.source.remote

/**
 * Source of tasks from backend.
 */
interface NetworkDataSource {

    suspend fun fetchTasks(): List<ApiTask>

    suspend fun updateTasks(tasks: List<ApiTask>)
}
