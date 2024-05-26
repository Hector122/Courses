package com.example.corps.channelevent

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch

sealed class MyEvent {
    data class ErrorEvent(val message: String) : MyEvent()
}

class MainViewModel : ViewModel() {

    private val eventChannel = Channel<MyEvent>()
    val eventFlow = eventChannel.receiveAsFlow()

    fun triggerEvent() = viewModelScope.launch {
        eventChannel.send(MyEvent.ErrorEvent("send value"))
    }
}
