package com.example.todoapp.features.task.model

/**
 * Immutable model class for a Task.
 */
data class Task(
    val id: Int,
    val title: String = "",
)
