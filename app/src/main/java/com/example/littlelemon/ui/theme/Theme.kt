package com.example.littlelemon.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Purple700 = Color(0xFFEE9972)

private val LightColorPalette = lightColors(
    primary = LittleLemonColor.yellow,
    primaryVariant = Purple700,
    secondary = LittleLemonColor.pink
)

@Composable
fun LittleLemonTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colors = LightColorPalette,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}
