package com.example.lab05.ui.screens.subjectsList

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.lab05.data.db.Lab5Database

class SubjectsListViewModelFactory(
    private val database: Lab5Database
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SubjectsListViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return SubjectsListViewModel(database) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}