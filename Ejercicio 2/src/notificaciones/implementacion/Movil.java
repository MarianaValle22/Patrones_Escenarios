package notificaciones.implementacion;

public class Movil implements Plataforma {
    public void mostrarNotificacion(String titulo, String mensaje){
        System.out.println("<MOVIL> " + titulo + " - " + mensaje);
    }
}