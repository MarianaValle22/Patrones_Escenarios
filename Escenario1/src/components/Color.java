package components;

public class Color {
    private final String nombre;

    public Color(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
