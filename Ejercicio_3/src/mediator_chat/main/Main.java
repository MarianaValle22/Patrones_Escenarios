package mediator_chat.main;

import mediator_chat.colleague.ConcreteUser;
import mediator_chat.colleague.User;
import mediator_chat.mediator.ChatRoom;

/**
 * Clase de demostración del Patrón Mediador en un Chat Grupal.
 */
public class Main {
    public static void main(String[] args) {
        // 1. Crear el Mediador (la Sala de Chat)
        ChatRoom chatRoom = new ChatRoom();

        // 2. Crear los Colegas (Usuarios)
        User alice = new ConcreteUser("Alice");
        User bob = new ConcreteUser("Bob");
        User charlie = new ConcreteUser("Charlie");

        // 3. Registrar los Usuarios en el Mediador (la sala gestiona las referencias)
        chatRoom.addUser(alice);
        chatRoom.addUser(bob);
        chatRoom.addUser(charlie);

        System.out.println("\n" + "=".repeat(50) + "\n");

        // 4. Los usuarios se comunican SOLO a través del Mediador (alice no conoce a bob o charlie)
        alice.sendMessage("¡Hola a todos! ¿Quién tiene el diagrama de clases?");

        System.out.println("\n" + "-".repeat(50) + "\n");
        
        bob.sendMessage("Hola Alice, lo acabo de subir al repositorio.");

        System.out.println("\n" + "-".repeat(50) + "\n");

        // 5. Demostración de escalabilidad (mantenimiento fácil)
        // Se añade un nuevo usuario sin modificar el código de Alice, Bob o Charlie
        User david = new ConcreteUser("David");
        chatRoom.addUser(david); // El mediador se encarga de la nueva relación

        System.out.println("\n" + "-".repeat(50) + "\n");

        charlie.sendMessage("Bienvenido David. Estamos revisando el Ejercicio 3.");
        
        System.out.println("\n" + "=".repeat(50) + "\n");
    }
}