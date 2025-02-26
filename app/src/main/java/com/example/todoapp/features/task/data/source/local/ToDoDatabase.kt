package com.example.todoapp.features.task.data.source.local

import androidx.room.Database
import androidx.room.RoomDatabase

/**
 * Room Database that contains the Task table.
 */
@Database(entities = [LocalTask::class], version = 1, exportSchema = false)
abstract class ToDoDatabase : RoomDatabase() {

    abstract fun taskDao(): TaskDao
}
