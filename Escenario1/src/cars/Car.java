package cars;

import components.*;

public class Car {
    private final Motor motor;
    private final Color color;
    private final Llantas llantas;
    private final Sonido sonido;
    private final Interiores interiores;
    private final TechoSolar techoSolar;
    private final GPS gps;

    public Car(Motor motor, Color color, Llantas llantas, Sonido sonido, Interiores interiores, TechoSolar techoSolar, GPS gps) {
        this.motor = motor;
        this.color = color;
        this.llantas = llantas;
        this.sonido = sonido;
        this.interiores = interiores;
        this.techoSolar = techoSolar;
        this.gps = gps;
    }

    @Override
    public String toString() {
        return "\nEl pedido de su carro ya fue enviado. A continuación puede ver su configuración final:\n" +
                "--------------------------------------------------\n" +
                "Motor       : " + motor + "\n" +
                "Color       : " + color + "\n" +
                "Llantas     : " + llantas + "\n" +
                "Sonido      : " + sonido + "\n" +
                "Interiores  : " + interiores + "\n" +
                "Techo Solar : " + techoSolar + "\n" +
                "GPS         : " + gps + "\n" +
                "--------------------------------------------------\n"+
                "¡Gracias por su compra!"
                ;
    }
}
