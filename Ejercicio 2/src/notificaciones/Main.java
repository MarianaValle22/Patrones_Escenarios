package notificaciones;

import notificaciones.abstraccion.Advertencia;
import notificaciones.abstraccion.Alerta;
import notificaciones.abstraccion.Confirmación;
import notificaciones.abstraccion.Mensaje;
import notificaciones.abstraccion.Notificacion;
import notificaciones.implementacion.Escritorio;
import notificaciones.implementacion.Movil;
import notificaciones.implementacion.Plataforma;
import notificaciones.implementacion.Web;

public class Main {
    public static void main(String[] args) {
        Plataforma web = new Web();
        Notificacion n = new Mensaje(web, "Nuevo mensaje", "parece que tienes un mensaje");
        n.mostrar();

        Plataforma escritorio = new Escritorio();
        Notificacion n2 = new Advertencia(escritorio, "ADVERTENCIA!!", "El siguiente enlace puede ser peligroso.");
        n2.mostrar();

        Plataforma movil = new Movil();
        Notificacion n3 = new Alerta(movil, "ALERTA!!", "El espacio de tu dispositivo está por terminarse.");
        n3.mostrar();

        Plataforma movil2 = new Movil();
        Notificacion n4 = new Confirmación(movil2, "Confirmación del pago", "Tu pago ha sido procesado con éxito.");
        n4.mostrar();

    }
}