package com.petconnect.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.petconnect.app.ui.screens.RegisterScreen
import com.petconnect.app.ui.theme.PetConnectTheme

/**
 * Actividad principal de la app.
 *
 * ¿Qué hace?
 * - Inicia la UI con Jetpack Compose.
 * - Aplica el tema global [PetConnectTheme].
 * - Renderiza la pantalla de registro [RegisterScreen].
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // setContent reemplaza el uso de XML tradicional para dibujar UI con Compose.
        setContent {
            // Tema global de colores/tipografía.
            PetConnectTheme {
                // Pantalla inicial mostrada al usuario.
                RegisterScreen()
            }
        }
    }
}
