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

    public Motor getMotor() {
        return motor;
    }

    public CarBuilder setColor(Color color) {
        this.color = color;
        return this;
    }

    public Color getColor() {
        return color;
    }

    public CarBuilder setLlantas(Llantas llantas) {
        this.llantas = llantas;
        return this;
    }

    public Llantas getLlantas() {
        return llantas;
    }

    public CarBuilder setSonido(Sonido sonido) {
        this.sonido = sonido;
        return this;
    }

    public Sonido getSonido() {
        return sonido;
    }

    public CarBuilder setInteriores(Interiores interiores) {
        this.interiores = interiores;
        return this;
    }

    public Interiores getInteriores() {
        return interiores;
    }

    public CarBuilder setTechoSolar(TechoSolar techoSolar) {
        this.techoSolar = techoSolar;
        return this;
    }

    public TechoSolar getTechoSolar() {
        return techoSolar;
    }

    public CarBuilder setGps(GPS gps) {
        this.gps = gps;
        return this;
    }

    public GPS getGps() {
        return gps;
    }

    public Car build() {
        return new Car(this);
    }
}
