package notificaciones.implementacion;

public class Web implements Plataforma {
    public void mostrarNotificacion(String titulo, String mensaje){
        System.out.println("<WEB> " + titulo + " - " + mensaje);
    }
}