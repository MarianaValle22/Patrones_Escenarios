package components;

public class GPS {
    private final boolean activo;

    public GPS(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return activo ? "Con GPS" : "Sin GPS";
    }
}
