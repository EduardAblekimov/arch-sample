package com.example.todoapp.features.task.presentation.taskdetail

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.todoapp.features.task.model.Task
import com.example.todoapp.features.task.data.TaskRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * ViewModel for the task detail screen.
 */
@HiltViewModel
class TaskDetailViewModel @Inject constructor(
    private val taskRepository: TaskRepository,
    savedStateHandle: SavedStateHandle
) : ViewModel() {

    data class TaskDetailUiState(
        val task: Task? = null,
        val isLoading: Boolean = false,
        val userMessage: Int? = null,
        val isTaskDeleted: Boolean = false
    )
}
