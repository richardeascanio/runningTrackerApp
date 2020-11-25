package com.richard.runningtrackerapp.ui.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.richard.runningtrackerapp.db.Run
import com.richard.runningtrackerapp.repositories.MainRepository
import kotlinx.coroutines.launch

class MainViewModel
@ViewModelInject
constructor(
    val mainRepository: MainRepository
): ViewModel() {

    val runsSortedByDate = mainRepository.getAllRunsSortedByDate()

    fun insertRun(run: Run) = viewModelScope.launch {
        mainRepository.insertRun(run)
    }
}