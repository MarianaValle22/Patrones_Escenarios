package components;

public class Motor {
    private final String tipo;

    public Motor(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return tipo;
    }
}
