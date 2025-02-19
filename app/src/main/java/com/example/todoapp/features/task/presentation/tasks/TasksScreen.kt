package com.example.todoapp.features.task.presentation.tasks

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel

/**
 * Here goes the UI of the screen with a list of tasks.
 *
 * Properly state hoisted to support unidirectional flow of data between VM and UI.
 */

@Composable
fun TasksScreen(
    modifier: Modifier = Modifier,
    viewModel: TasksViewModel = hiltViewModel(),
) {

    TasksContent(modifier = modifier)
}

@Composable
private fun TasksContent(
    modifier: Modifier = Modifier
) {

}