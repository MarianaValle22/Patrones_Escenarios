package notificaciones.abstraccion;

import notificaciones.implementacion.Plataforma;

public abstract class Notificacion {
    protected final Plataforma plataforma;
    protected final String titulo;
    protected final String mensaje;

    public Notificacion(Plataforma plataforma, String titulo, String mensaje){
        this.plataforma= plataforma;
        this.titulo= titulo;
        this.mensaje= mensaje;
    }

    public abstract void mostrar();
}