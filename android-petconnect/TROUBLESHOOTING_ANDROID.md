# Solución de errores comunes - Android Studio (Pet Connect)

## 1) Se queda en "Importing Gradle Project"
- Espera la primera sincronización (puede tardar varios minutos).
- Ve a `File > Sync Project with Gradle Files`.
- Verifica conexión a internet para descargar dependencias.

## 2) Error: Android resource linking failed
Este error suele aparecer cuando falta algún recurso de tema o string.

### Qué revisar en este proyecto
- `AndroidManifest.xml` debe apuntar a un tema válido del sistema:
  - `@android:style/Theme.DeviceDefault.Light.NoActionBar`
- `app/src/main/res/values/strings.xml` debe tener `app_name`.

## 3) Error por versión de Java/JDK
Este proyecto usa Java/Kotlin target 17.

### Configuración recomendada
- En Android Studio: `Settings > Build, Execution, Deployment > Build Tools > Gradle`
- `Gradle JDK`: seleccionar **JDK 17**.

## 4) No aparece la interfaz
- Verifica que `MainActivity` llame `RegisterScreen()`.
- Corre `Build > Rebuild Project`.
- Luego ejecuta con `Run` en un emulador/dispositivo.

## 5) Ruta correcta para abrir en Android Studio
Abrir la carpeta:
- `android-petconnect/`

No abrir únicamente `app/` ni la raíz de otro proyecto no relacionado.
