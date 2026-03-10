package com.petconnect.app.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

/**
 * Esquema claro principal de la app.
 *
 * Nota:
 * La app actualmente fuerza este esquema para mantener consistencia visual
 * durante pruebas académicas del prototipo.
 */
private val LightColors = lightColorScheme(
    primary = BluePrimary,
    secondary = OrangePrimary,
    background = BackgroundSoft,
    surface = BlueLight,
    onPrimary = androidx.compose.ui.graphics.Color.White,
    onSecondary = androidx.compose.ui.graphics.Color.White,
    onBackground = TextDark,
    onSurface = TextDark
)

/**
 * Esquema oscuro (definido para futura extensión).
 *
 * Por ahora no se aplica automáticamente, pero se deja preparado.
 */
private val DarkColors = darkColorScheme(
    primary = BluePrimary,
    secondary = OrangePrimary
)

/**
 * Tema global de Pet Connect.
 *
 * Envuelve cualquier pantalla Compose para aplicar colores y tipografía.
 */
@Composable
fun PetConnectTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        // Si quieres habilitar modo oscuro dinámico, se puede cambiar aquí.
        colorScheme = LightColors,
        typography = androidx.compose.material3.Typography(),
        content = content
    )
}
