package cars;

import builders.CarBuilder;
import components.*;

public class Car {
    private final Motor motor;
    private final Color color;
    private final Llantas llantas;
    private final Sonido sonido;
    private final Interiores interiores;
    private final TechoSolar techoSolar;
    private final GPS gps;

    public Car(CarBuilder builder) {
        // Datos por defecto
        this.motor = builder.getMotor() != null ? builder.getMotor() : new Motor("Estándar");
        this.color = builder.getColor() != null ? builder.getColor() : new Color("Negro");
        this.llantas = builder.getLlantas() != null ? builder.getLlantas() : new Llantas("16''");
        this.sonido = builder.getSonido() != null ? builder.getSonido() : new Sonido("Básico");
        this.interiores = builder.getInteriores() != null ? builder.getInteriores() : new Interiores("Tela estándar");
        this.techoSolar = builder.getTechoSolar() != null ? builder.getTechoSolar() : new TechoSolar(false);
        this.gps = builder.getGps() != null ? builder.getGps() : new GPS(false);
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
                "¡Gracias por su compra!";
    }
}
