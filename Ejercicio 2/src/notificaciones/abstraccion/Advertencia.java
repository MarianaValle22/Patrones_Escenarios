package notificaciones.abstraccion;

import notificaciones.implementacion.Plataforma;

public class Advertencia extends Notificacion {

    public Advertencia(Plataforma p, String titulo, String mensaje) {
        super(p, titulo, mensaje);
    }

    public void mostrar() {
        plataforma.mostrarNotificacion(titulo, mensaje);
    }

}