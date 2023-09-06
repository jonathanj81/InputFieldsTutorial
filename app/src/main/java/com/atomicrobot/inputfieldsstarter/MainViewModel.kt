package com.atomicrobot.inputfieldsstarter

import androidx.lifecycle.ViewModel
import com.atomicrobot.inputfieldstutorial.R
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject
import kotlin.random.Random

@HiltViewModel
class MainViewModel @Inject constructor(): ViewModel() {

    private val _state = MutableStateFlow(State())
    val state: StateFlow<State> = _state.asStateFlow()

    fun updateInputText(newText: String) {
        _state.update {
            it.copy(
                currentInputText = newText
            )
        }
    }

    fun updateLabelText(hasFocus: Boolean) {
        _state.update {
            it.copy(
                labelText = if (hasFocus || it.currentInputText.isNotEmpty()) R.string.input_label else R.string.placeholder_text
            )
        }
    }

    fun randomUpdate(){
        val num = Random.nextInt()

        if (num % 2 == 0){
            _state.update {
                it.copy(
                    isError = true,
                    enabled = true
                )
            }
        } else if (num % 3 == 0){
            _state.update {
                it.copy(
                    enabled = false,
                    isError = false
                )
            }
        } else {
            _state.update {
                it.copy(
                    enabled = true,
                    isError = false
                )
            }
        }
    }

    data class State(
        val currentInputText: String = "",
        val labelText: Int = R.string.placeholder_text,
        val isError: Boolean = false,
        val enabled: Boolean = true
    )
}