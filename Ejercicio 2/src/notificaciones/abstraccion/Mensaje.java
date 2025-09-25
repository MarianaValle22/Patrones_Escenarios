package notificaciones.abstraccion;

import notificaciones.implementacion.Plataforma;

public class Mensaje extends Notificacion {

    public Mensaje(Plataforma p, String titulo, String mensaje) {
        super(p, titulo, mensaje);
    }

    public void mostrar() {
        plataforma.mostrarNotificacion(titulo, mensaje);
    }

}