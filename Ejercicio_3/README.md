# Ejercicio 3: Aplicación de Chat Grupal

## Patrón de Diseño Identificado: Mediator (Mediador)

| Aspecto | Detalle |
| :--- | :--- |
| **Tipo de Patrón** | Comportamiento (Behavioral) |
| **Patrón Seleccionado** | **Mediator** |

### Justificación


La solución implementa el Patrón Mediador para lograr un **bajo acoplamiento**, centralizando toda la comunicación del chat.

El flujo es simple: el **Colega Concreto** (`ConcreteUser`) solo conoce a la interfaz **Mediador** (`ChatMediator`). Cuando un usuario quiere hablar, invoca **`mediator.sendMessage(...)`** y se desentiende del resto. El **Mediador Concreto** (`ChatRoom`) toma ese mensaje y lo distribuye a todos los demás usuarios.

Este diseño cumple con principios clave de **SOLID**:

* **Responsabilidad Única (SRP):** El usuario (`ConcreteUser`) solo maneja su envío y recepción. La sala de chat (`ChatRoom`) solo maneja la lógica de la lista y la distribución. Hay una clara separación de responsabilidades.
* **Abierto/Cerrado (OCP):** Podemos añadir nuevos tipos de usuarios (ej. un usuario *premium* o un *moderador*) simplemente creando una nueva clase que extienda de `User` **sin modificar** la lógica central de la `ChatRoom`.
* **Inversión de Dependencia (DIP):** El usuario concreto depende de una **abstracción** (`ChatMediator`) para comunicarse, no de otros usuarios concretos, lo que garantiza la flexibilidad y el desacoplamiento.

Con esto, el sistema es fácil de escalar y mantener, ya que la adición o eliminación de un usuario solo requiere un ajuste en la lista del mediador, sin modificar el código de los participantes.