package com.example.todoapp.features.task.data.source.local

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert
import com.example.todoapp.features.task.data.source.local.LocalTask
import kotlinx.coroutines.flow.Flow

/**
 * Data Access Object for the task table.
 */
@Dao
interface TaskDao {

    // here goes different DAO queries and operations
}
