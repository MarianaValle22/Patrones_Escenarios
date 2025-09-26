# Ejercicio 3: Aplicación de Chat Grupal

## Patrón de Diseño Identificado: Mediator (Mediador)

| Aspecto | Detalle |
| :--- | :--- |
| **Tipo de Patrón** | Comportamiento (Behavioral) |
| **Patrón Seleccionado** | **Mediator** |

### Justificación

El escenario presenta un problema de **alto acoplamiento** donde cada objeto (`Usuario`) necesitaría conocer a todos los demás para comunicarse, dificultando la escalabilidad y el mantenimiento.

El **Patrón Mediador** resuelve esto al:
1.  **Centralizar la Comunicación:** Introduce un objeto central (`ChatRoom`) que actúa como mediador.
2.  **Reducir la Dependencia:** Los objetos (`User`) solo se comunican con el Mediador y no entre sí.
3.  **Facilitar el Mantenimiento y la Escalabilidad:** Agregar o eliminar un usuario solo implica modificar la lista del Mediador, sin tocar la lógica de comunicación interna de los usuarios existentes.

Esto asegura que la lógica de "sala de chat" se maneje en un único lugar, cumpliendo con los principios **SOLID**, especialmente el **Principio de Responsabilidad Única (SRP)** y el **Principio Abierto/Cerrado (OCP)**.