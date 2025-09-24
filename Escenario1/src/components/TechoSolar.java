package components;

public class TechoSolar {
    private final boolean activo;

    public TechoSolar(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return activo ? "Con Techo Solar" : "Sin Techo Solar";
    }
}
