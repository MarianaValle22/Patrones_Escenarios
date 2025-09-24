package builders;

import cars.Car;
import components.*;

public class CarBuilder {
    private Motor motor;
    private Color color;
    private Llantas llantas;
    private Sonido sonido;
    private Interiores interiores;
    private TechoSolar techoSolar;
    private GPS gps;

    public CarBuilder setMotor(Motor motor) {
        this.motor = motor;
        return this;
    }

    public CarBuilder setColor(Color color) {
        this.color = color;
        return this;
    }

    public CarBuilder setLlantas(Llantas llantas) {
        this.llantas = llantas;
        return this;
    }

    public CarBuilder setSonido(Sonido sonido) {
        this.sonido = sonido;
        return this;
    }

    public CarBuilder setInteriores(Interiores interiores) {
        this.interiores = interiores;
        return this;
    }

    public CarBuilder setTechoSolar(TechoSolar techoSolar) {
        this.techoSolar = techoSolar;
        return this;
    }

    public CarBuilder setGps(GPS gps) {
        this.gps = gps;
        return this;
    }

    public Car build() {
        // Valores por defecto
        if (motor == null) motor = new Motor("Estándar");
        if (color == null) color = new Color("Negro");
        if (llantas == null) llantas = new Llantas("16''");
        if (sonido == null) sonido = new Sonido("Básico");
        if (interiores == null) interiores = new Interiores("Tela estándar");
        if (techoSolar == null) techoSolar = new TechoSolar(false);
        if (gps == null) gps = new GPS(false);

        return new Car(motor, color, llantas, sonido, interiores, techoSolar, gps);
    }
}
