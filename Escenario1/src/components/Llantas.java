package components;

public class Llantas {
    private final String tamaño;

    public Llantas(String tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return tamaño;
    }
}

