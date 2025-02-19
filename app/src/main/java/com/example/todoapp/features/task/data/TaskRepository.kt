package com.example.todoapp.features.task.data

import com.example.todoapp.features.task.model.Task
import kotlinx.coroutines.flow.Flow

/**
 * Interface to the task data layer. Allows us to later mock it for testing and also
 * gives a first look on how it would look like.
 *
 * Implementation will not be done, as we are looking at the top-level architecture.
 */
interface TaskRepository {

    fun getTasksStream(): Flow<List<Task>>

    suspend fun getTasks(): List<Task>

    fun getTaskStream(taskId: String): Flow<Task?>

    suspend fun getTask(taskId: String): Task?

    suspend fun createTask(title: String): String

    suspend fun updateTask(taskId: String, title: String)

    suspend fun completeTask(taskId: String)

    suspend fun deleteTask(taskId: String)

    suspend fun deleteAllTasks()
}
