package mediator_chat.colleague;

import mediator_chat.mediator.ChatMediator;

/**
 * Clase Abstracta del Colega: Define la estructura básica de un usuario.
 * Un usuario solo conoce a su mediador.
 */
public abstract class User {
    
    protected ChatMediator mediator;
    protected String name;

    public User(String name) {
        this.name = name;
    }
    
    // El mediador le asigna su referencia (Inversión de Dependencia - DIP)
    public void setMediator(ChatMediator mediator) {
        this.mediator = mediator;
    }
    
    public String getName() {
        return name;
    }

    // Método que usa el mediador para enviar un mensaje (petición de comunicación)
    public abstract void sendMessage(String message);
    
    // Método para recibir un mensaje (notificación del mediador)
    public abstract void receiveMessage(String message);
}