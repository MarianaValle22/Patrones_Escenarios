package notificaciones.abstraccion;

import notificaciones.implementacion.Plataforma;

public class Alerta extends Notificacion {

    public Alerta(Plataforma p, String titulo, String mensaje) {
        super(p, titulo, mensaje);
    }

    public void mostrar() {
        plataforma.mostrarNotificacion(titulo, mensaje);
    }
    
}