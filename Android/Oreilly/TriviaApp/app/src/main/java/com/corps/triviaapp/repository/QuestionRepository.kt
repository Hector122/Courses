package com.corps.triviaapp.repository

import android.util.Log
import com.corps.triviaapp.data.DataOrException
import com.corps.triviaapp.model.QuestionItem
import com.corps.triviaapp.network.QuestionApi
import javax.inject.Inject


class QuestionRepository @Inject constructor(private val api: QuestionApi) {

    private val dataOrException = DataOrException<ArrayList<QuestionItem>, Boolean, Exception>()

    suspend fun getAllQuestion(): DataOrException<ArrayList<QuestionItem>, Boolean, Exception> {
        try {
            dataOrException.loading = true
            dataOrException.data = api.getAllQuestion()

            if (dataOrException.data.toString().isNotEmpty()) dataOrException.loading = false

        } catch (e: Exception) {
            dataOrException.e = e
            dataOrException.e!!.localizedMessage?.let { Log.e("TAG", it) }
        }

        return dataOrException
    }
}
