# Pet Connect — Requerimientos para Interfaz en Android Studio

## 1. Introducción
Este documento adapta los requerimientos de **Pet Connect** (originalmente pensados para una web ecommerce) a una **aplicación móvil Android** desarrollada en **Android Studio**.

El objetivo es definir:
- Requisitos funcionales y no funcionales para móvil.
- Estructura de navegación en Android.
- Diseño visual coherente con la identidad actual (monocromática).
- Base técnica recomendada para implementar la interfaz.

---

## 2. Identidad visual (adaptada a Android)

### 2.1 Paleta principal
- **Fondo general:** gris muy claro `#F2F2F2`.
- **Superficies (cards/modales):** blanco `#FFFFFF`.
- **Texto principal y bordes:** negro `#000000`.
- **Texto secundario / precio anterior:** gris medio `#7A7A7A` con tachado.
- **Overlay modal:** negro translúcido `#66000000`.

### 2.2 Sensación de diseño
- Limpieza.
- Profesionalismo.
- Orden visual.
- Claridad de lectura.

### 2.3 Recomendación opcional para identidad veterinaria
Mantener la base monocromática y agregar colores de apoyo en elementos puntuales:
- Verde suave (éxito / salud).
- Azul claro (confianza / información).

---

## 3. Arquitectura de interfaz en Android Studio

### 3.1 Stack recomendado
- **Lenguaje:** Kotlin.
- **UI:** Jetpack Compose (recomendado) o XML + Material Components.
- **Navegación:** Navigation Component / NavHost.
- **Patrón:** MVVM.
- **Estado:** ViewModel + StateFlow.

### 3.2 Mapa de navegación móvil
1. **Splash** (opcional).
2. **Inicio**.
3. **Catálogo**.
4. **Detalle de producto**.
5. **Carrito** (pantalla o bottom sheet modal).
6. **Checkout**.
7. **Adopción**.
8. **Detalle de mascota**.
9. **Contacto**.
10. **Iniciar sesión**.
11. **Registro**.
12. **Perfil / Mis pedidos** (si aplica).

### 3.3 Navegación sugerida
- **BottomNavigation:** Inicio, Catálogo, Adopción, Contacto.
- **TopAppBar:** título + ícono de carrito con contador + acceso a perfil/login.
- **Flujo autenticación:** modal o pantalla dedicada (Login / Registro).

---

## 4. Requerimientos funcionales (RF) para app Android

## 4.1 Inicio y catálogo
- **RF01.** La app debe mostrar pantalla de **Inicio** con secciones destacadas (Descuentos, Nuevos).
- **RF02.** La app debe mostrar pantalla de **Catálogo** con listado paginado/scroll.
- **RF03.** La app debe mostrar **detalle de producto**: nombre, categoría, precio, imagen, descripción y stock.
- **RF04.** La app debe permitir **filtrar por categoría**.
- **RF05.** La app debe permitir **buscar productos por nombre/palabras clave**.

## 4.2 Carrito y compra
- **RF06.** Permitir agregar productos al carrito desde Inicio, Catálogo y Detalle.
- **RF07.** Mostrar carrito con productos, cantidades, subtotal y total.
- **RF08.** Permitir modificar cantidades desde el carrito.
- **RF09.** Permitir eliminar productos del carrito.
- **RF10.** Mostrar contador de ítems sobre el ícono del carrito.
- **RF11.** Permitir iniciar el proceso de checkout.
- **RF12.** Confirmar pedido y mostrar resumen con número de orden.

## 4.3 Usuarios (autenticación)
- **RF13.** Permitir registro con nombre, correo y contraseña.
- **RF14.** Permitir iniciar sesión con credenciales válidas.
- **RF15.** Permitir cierre de sesión.
- **RF16.** Permitir recuperación de contraseña (recomendado).

## 4.4 Adopción
- **RF17.** Mostrar sección de adopción con mascotas disponibles.
- **RF18.** Mostrar detalle de mascota: foto, edad, descripción y requisitos.
- **RF19.** Permitir enviar solicitud de adopción por formulario.

## 4.5 Contacto
- **RF20.** Permitir envío de formulario de contacto (nombre, correo, mensaje).
- **RF21.** Mostrar confirmación de envío exitoso.

## 4.6 Administración (módulo futuro)
- **RF22.** Administrador puede crear/editar/eliminar productos.
- **RF23.** Administrador puede actualizar precio, descuento y stock.
- **RF24.** Administrador puede gestionar publicaciones de adopción.
- **RF25.** Administrador puede ver pedidos y estados.

---

## 5. Requerimientos no funcionales (RNF) en Android

## 5.1 Usabilidad y diseño
- **RNF01.** Interfaz consistente con identidad Pet Connect.
- **RNF02.** Diseño adaptable a múltiples tamaños de pantalla (teléfono/tablet).
- **RNF03.** Navegación clara con rutas visibles y jerarquía simple.

## 5.2 Rendimiento
- **RNF04.** Tiempo de carga de pantalla objetivo ≤ 3 segundos en red normal.
- **RNF05.** Actualización del carrito visible en ≤ 1 segundo.

## 5.3 Seguridad
- **RNF06.** Contraseñas cifradas en backend (hash seguro).
- **RNF07.** Validación de entradas para prevenir inyecciones y contenido malicioso.
- **RNF08.** Manejo de sesión segura (token/cookie segura, expiración y logout).

## 5.4 Compatibilidad
- **RNF09.** Soporte para versiones Android modernas (mínimo sugerido: API 26+).
- **RNF10.** Funcionamiento sin errores visibles en resoluciones comunes.

## 5.5 Mantenibilidad
- **RNF11.** Código modular (ui/domain/data).
- **RNF12.** Convenciones de nombres y estructura por feature.
- **RNF13.** Logging controlado en desarrollo y manejo de errores en producción.

---

## 6. Diseño de pantallas (UI) en Android Studio

## 6.1 Inicio
- Fondo gris claro.
- Carruseles o listas horizontales de productos destacados.
- Cards blancas con borde negro.
- Precio actual en negro fuerte y precio anterior en gris tachado.

## 6.2 Catálogo
- Barra de búsqueda superior con borde negro.
- Filtros por chip/categoría.
- Grid o lista de cards de producto.
- Consistencia visual con Inicio.

## 6.3 Detalle de producto
- Imagen principal.
- Nombre, categoría, precio, descripción, stock.
- Botón “Agregar al carrito”.

## 6.4 Carrito
- Modal o pantalla dedicada.
- Fondo blanco con controles de cantidad (+/-).
- Total destacado en negro fuerte.
- Botones: “Seguir comprando” y “Ir a pagar”.

## 6.5 Contacto
- Formulario simple (nombre, correo, mensaje).
- Campos blancos con borde negro.
- Botón “Enviar” con estilo consistente.

## 6.6 Login / Registro
- Fondo externo oscurecido si es modal.
- Caja blanca con borde negro.
- Inputs limpios y botón principal consistente.
- Mensajes de error claros y cercanos al campo.

## 6.7 Adopción
- Tarjetas de mascotas con imagen y datos clave.
- Detalle con requisitos de adopción.
- Botón de solicitud.

---

## 7. Componentes reutilizables recomendados
- `ProductCard`
- `PriceTag` (precio actual + anterior)
- `OutlinedInputField`
- `PrimaryOutlinedButton`
- `CartBadgeIcon`
- `PetCard`
- `SectionHeader`

Esto asegura consistencia visual y acelera mantenimiento.

---

## 8. Criterios de aceptación (ejemplos)
- Al tocar “Agregar al carrito”, el contador del ícono aumenta inmediatamente.
- Al editar cantidad en carrito, el total se recalcula en tiempo real.
- Si el login falla, se muestra mensaje sin cerrar la pantalla.
- Al enviar Contacto, aparece confirmación visible.
- En móvil pequeño, los elementos no se superponen ni se cortan.

---

## 9. Recomendación de implementación por fases
1. **Fase 1:** UI base + navegación + datos mock.
2. **Fase 2:** Integración backend (auth, catálogo, carrito).
3. **Fase 3:** Checkout y módulo adopción.
4. **Fase 4:** Perfil, historial, mejoras UX, analítica y pruebas.

---

## 10. Conclusión
Pet Connect puede migrar correctamente de una propuesta web a Android manteniendo su estilo minimalista, profesional y claro. Con esta especificación, el equipo puede construir una interfaz en Android Studio alineada con los objetivos del negocio, lista para validación iterativa y evolución por módulos.
