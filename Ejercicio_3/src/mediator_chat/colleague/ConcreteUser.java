package mediator_chat.colleague;

/**
 * Colega Concreto: Los usuarios solo envían y reciben mensajes a través de su mediador.
 */
public class ConcreteUser extends User {

    public ConcreteUser(String name) {
        super(name);
    }

    @Override
    public void sendMessage(String message) {
        if (mediator != null) {
            System.out.println("   " + name + " -> Envía mensaje al Mediador.");
            // El usuario no conoce a nadie más, sólo le pide al mediador que haga el trabajo.
            mediator.sendMessage(message, this);
        } else {
            System.out.println("   " + name + " no está en ninguna sala de chat para enviar mensajes.");
        }
    }

    @Override
    public void receiveMessage(String message) {
        // La lógica de un usuario al recibir un mensaje
        System.out.println("   " + name + " recibe: " + message);
    }
}