import builders.CarBuilder;
import cars.Car;
import components.*;

public class Main {
    public static void main(String[] args) {
        // Primer carro
        Car deportivo = new CarBuilder()
                .setMotor(new Motor("V8"))
                .setColor(new Color("Rojo"))
                .setLlantas(new Llantas("18''"))
                .setSonido(new Sonido("Bose Premium"))
                .setTechoSolar(new TechoSolar(true))
                .setGps(new GPS(true))
                .build();

        // Segundo carro
        Car electrico = new CarBuilder()
                .setMotor(new Motor("Eléctrico"))
                .setColor(new Color("Azul"))
                .setInteriores(new Interiores("Cuero negro"))
                .build();

        System.out.println(deportivo);
        System.out.println(electrico);
    }
}
