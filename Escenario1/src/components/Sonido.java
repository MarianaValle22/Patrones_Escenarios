package components;

public class Sonido {
    private final String nombre;

    public Sonido(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
