package mediator_chat.mediator;

import java.util.ArrayList;
import java.util.List;
import mediator_chat.colleague.User;

/**
 * Mediador Concreto: Centraliza la lógica de comunicación del chat.
 */
public class ChatRoom implements ChatMediator {
    
    private List<User> users;

    public ChatRoom() {
        this.users = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        System.out.println("--- Sala: " + user.getName() + " se ha unido al chat. ---");
        this.users.add(user);
        // Asignar esta sala como el mediador del usuario
        user.setMediator(this); 
    }

    @Override
    public void sendMessage(String message, User sender) {
        System.out.println("\n[MEDIADOR] Recibido de " + sender.getName() + ": '" + message + "'");
        
        // La lógica centralizada del chat: enviar a todos EXCEPTO al remitente
        for (User user : this.users) {
            // No enviar el mensaje de vuelta al remitente
            if (user != sender) {
                user.receiveMessage("[" + sender.getName() + "]: " + message);
            }
        }
    }
}