package com.example.todoapp

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.todoapp.features.task.presentation.taskdetail.TaskDetailScreen
import com.example.todoapp.features.task.presentation.tasks.TasksScreen
import kotlinx.serialization.Serializable

@Serializable
object TaskList

@Serializable
data class TaskDetail(val taskId: Int)

@Composable
fun TodoNavGraph(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
) {
    NavHost(
        navController = navController,
        startDestination = TaskList,
        modifier = modifier
    ) {
        composable<TaskList> {
            TasksScreen()
        }
        composable<TaskDetail> { backStackEntry ->
            val taskId = backStackEntry.toRoute<TaskDetail>().taskId
            TaskDetailScreen(taskId = taskId)
        }
    }
}
