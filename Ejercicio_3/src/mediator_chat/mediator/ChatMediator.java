package mediator_chat.mediator;

import mediator_chat.colleague.User;

/**
 * Interfaz del Mediador: Define el contrato para la comunicación entre los colegas (usuarios).
 */
public interface ChatMediator {
    
    // Método para registrar un nuevo colega (usuario)
    void addUser(User user);
    
    // Método para manejar y distribuir un mensaje
    void sendMessage(String message, User sender);
}