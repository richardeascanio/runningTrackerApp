package com.richard.runningtrackerapp.ui.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.richard.runningtrackerapp.repositories.MainRepository

class StatisticsViewModel
@ViewModelInject
constructor(
    val mainRepository: MainRepository
): ViewModel() {
}