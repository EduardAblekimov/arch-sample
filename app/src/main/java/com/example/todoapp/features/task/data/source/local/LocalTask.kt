package com.example.todoapp.features.task.data.source.local

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Db model of the task. We need to split models on domains: business, API and DB (and, potentially,
 * other sources) to reduce couping between different domains.
 *
 * Mappers are responsible to map different models.
 */
@Entity(
    tableName = "task"
)
data class LocalTask(
    @PrimaryKey val id: String,
    var title: String,
    var description: String,
    var isCompleted: Boolean,
)
