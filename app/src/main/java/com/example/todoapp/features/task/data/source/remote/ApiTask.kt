package com.example.todoapp.features.task.data.source.remote

/**
 * Db model of the task. We need to split models on domains: business, API and DB (and, potentially,
 * other sources) to reduce couping between different domains.
 *
 * Mappers are responsible to map different models.
 */
data class ApiTask(
    val id: String,
    val title: String,
)
