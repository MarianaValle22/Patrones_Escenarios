package notificaciones.abstraccion;

import notificaciones.implementacion.Plataforma;

public class Confirmación extends Notificacion {

    public Confirmación(Plataforma p, String titulo, String mensaje) {
        super(p, titulo, mensaje);
    }

    public void mostrar() {
        plataforma.mostrarNotificacion(titulo, mensaje);
    }
    
}