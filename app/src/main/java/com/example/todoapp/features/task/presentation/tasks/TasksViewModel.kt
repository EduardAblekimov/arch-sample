package com.example.todoapp.features.task.presentation.tasks

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.todoapp.features.task.model.Task
import com.example.todoapp.features.task.data.TaskRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * ViewModel for the task list screen
 */
@HiltViewModel
class TasksViewModel @Inject constructor(
    private val taskRepository: TaskRepository,
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {


    /**
     * UiState for the task list screen observables
     */
    data class UiState(
        val items: List<Task> = emptyList(),
    )
}
