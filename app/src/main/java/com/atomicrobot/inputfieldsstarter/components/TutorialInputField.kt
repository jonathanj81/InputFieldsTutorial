package com.atomicrobot.inputfieldsstarter.components

import androidx.annotation.StringRes
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.CalendarMonth
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.atomicrobot.inputfieldsstarter.theme.Colors
import com.atomicrobot.inputfieldstutorial.R

@Composable
fun TutorialInputField(
    textValue: String,
    @StringRes labelTextRes: Int,
    isError: Boolean,
    enabled: Boolean,
    onTextChanged: (String) -> Unit,
    onFocusChanged: (Boolean) -> Unit
) {

    OutlinedTextField(
        modifier = Modifier.onFocusChanged {
           onFocusChanged(it.hasFocus)
        },
        value = textValue,
        onValueChange = onTextChanged,
        isError = isError,
        enabled = enabled,
        label = { Text(stringResource(id = labelTextRes)) },
        placeholder = { Text(stringResource(id = R.string.placeholder_text)) },
        trailingIcon = {
            Icon(
                imageVector = Icons.Outlined.CalendarMonth,
                contentDescription = stringResource(id = R.string.cd_calendar)
            )
        },
        supportingText = {
            when (isError) {
                true -> Text(stringResource(id = R.string.error_message))
                false -> {}
            }
        },
        colors = OutlinedTextFieldDefaults.colors(
            focusedTrailingIconColor = Colors.SECONDARYCOSMIC.color
        ),
        shape = RoundedCornerShape(8.dp)
    )
}