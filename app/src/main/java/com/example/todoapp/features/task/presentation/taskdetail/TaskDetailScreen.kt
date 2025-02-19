package com.example.todoapp.features.task.presentation.taskdetail

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.todoapp.features.task.presentation.tasks.TasksViewModel

/**
 * Here goes UI of a detail screen of the task.
 *
 * Properly state hoisted to support unidirectional flow of data between VM and UI.
 */

@Composable
fun TaskDetailScreen(
    taskId: Int,
    modifier: Modifier = Modifier,
    viewModel: TasksViewModel = hiltViewModel(),
) {

    TaskDetailContent(modifier = modifier)
}

@Composable
private fun TaskDetailContent(
    modifier: Modifier = Modifier
) {

}