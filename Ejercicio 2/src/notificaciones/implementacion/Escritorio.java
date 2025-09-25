package notificaciones.implementacion;

public class Escritorio implements Plataforma {
    public void mostrarNotificacion(String titulo, String mensaje){
        System.out.println("<ESCRITORIO> " + titulo + " - " + mensaje);
    }
}