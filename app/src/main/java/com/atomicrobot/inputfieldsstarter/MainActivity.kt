package com.atomicrobot.inputfieldsstarter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.atomicrobot.inputfieldsstarter.components.TutorialInputField
import com.atomicrobot.inputfieldsstarter.theme.InputFieldsStarterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewModel = MainViewModel()

        setContent {
            InputFieldsStarterTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BaseComposable(viewModel = viewModel)
                }
            }
        }
    }
}

@Composable
fun BaseComposable(
    viewModel: MainViewModel
) {

    val inputState by viewModel.state.collectAsState()

    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize()
    ) {
        TutorialInputField(
            textValue = inputState.currentInputText,
            labelTextRes = inputState.labelText,
            isError = inputState.isError,
            enabled = inputState.enabled,
            onTextChanged = viewModel::updateInputText,
            onFocusChanged = viewModel::updateLabelText
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = viewModel::randomUpdate
        ){
            Text("Change Something")
        }
    }
}