package com.corps.triviaapp.screens

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.corps.triviaapp.data.DataOrException
import com.corps.triviaapp.model.QuestionItem
import com.corps.triviaapp.repository.QuestionRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import java.lang.Exception
import javax.inject.Inject

@HiltViewModel
class QuestionViewModel @Inject constructor(
    private val questionRepository: QuestionRepository
) : ViewModel() {

    val data: MutableState<DataOrException<ArrayList<QuestionItem>, Boolean, Exception>> =
        mutableStateOf(DataOrException(null, true, Exception("")))


    init {
        getAllQuestion()
    }

    private fun getAllQuestion() {
        viewModelScope.launch {
            data.value.loading = true
            data.value = questionRepository.getAllQuestion()

            if (data.value.data.toString().isNotEmpty()) {
                data.value.loading = false
            }
        }
    }
    fun getTotalQuestionCount(): Int {
        return data.value.data?.toMutableList()?.size!!
    }

}
