package com.atomicrobot.inputfieldsstarter.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable


private val DarkColorPalette = darkColorScheme(
    outline = Colors.MONO400.color,
    primary = Colors.SECONDARYCOSMIC.color,
    onPrimary = Colors.PRIMARYNEUTRON.color,
    surface = Colors.WHITE.color,
    onSurface = Colors.PRIMARYNEUTRON.color,
    onSurfaceVariant = Colors.MONO400.color,
    background = Colors.WHITE.color,
    onBackground = Colors.BLACK.color,
    error = Colors.SEMANTICFAILURE.color
)

private val LightColorPalette = lightColorScheme(
    outline = Colors.MONO400.color,
    primary = Colors.SECONDARYCOSMIC.color,
    onPrimary = Colors.PRIMARYNEUTRON.color,
    surface = Colors.WHITE.color,
    onSurface = Colors.PRIMARYNEUTRON.color,
    onSurfaceVariant = Colors.MONO400.color,
    background = Colors.WHITE.color,
    onBackground = Colors.BLACK.color,
    error = Colors.SEMANTICFAILURE.color
)


@Composable
fun InputFieldsStarterTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {

    MaterialTheme(
        colorScheme = if (darkTheme) DarkColorPalette else LightColorPalette,
        typography = typography,
        content = content
    )
}