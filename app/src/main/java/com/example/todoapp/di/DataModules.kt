package com.example.todoapp.di

import android.content.Context
import androidx.room.Room
import com.example.todoapp.features.task.data.source.local.TaskDao
import com.example.todoapp.features.task.data.source.local.ToDoDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule {

    // interface to implementation bindings, etc
}

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Singleton
    @Provides
    fun provideDataBase(@ApplicationContext context: Context): ToDoDatabase {
        return Room.databaseBuilder(
            context.applicationContext,
            ToDoDatabase::class.java,
            "Tasks.db"
        ).build()
    }

    @Provides
    fun provideTaskDao(database: ToDoDatabase): TaskDao = database.taskDao()
}
