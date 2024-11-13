package com.rocketseat.nlw.nearby.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColors = lightColorScheme(
    primary = GreenBase,
    onPrimary = Color.White,
    secondary = RedBase,
    onSecondary = Color.White,
    background = Gray100,
    onBackground = Gray600,
    surface = Gray100,
    onSurface = Gray600,
    error = RedBase,
    onError = Color.White
)

private val DarkColors = darkColorScheme(
    primary = GreenLight,
    onPrimary = Color.Black,
    secondary = RedLight,
    onSecondary = Color.Black,
    background = Gray600,
    onBackground = Gray100,
    surface = Gray600,
    onSurface = Gray200,
    error = RedBase,
    onError = Color.Black
)

@Composable
fun NearbyTheme(
    darkTheme: Boolean = false,
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColors
    } else {
        LightColors
    }

    MaterialTheme(
        colorScheme = colors,
        typography = Typography,
        content = content
    )
}