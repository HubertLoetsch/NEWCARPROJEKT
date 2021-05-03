import java.awt.*;

public class Main {

    /***
     *
     * Hello this is my new car OOP project Have a nice day
     */
    public static void main(String[] args) {

        Engine e1 = new Engine(140, Engine.TYPE.DIESEL);

        BasicCar c1 = new BasicCar("Blue", "9000", "Audi", "A001", e1);
        System.out.println("Farbe:");
        System.out.println(c1.getColor());
        System.out.println("Preis:");
        System.out.println(c1.getPrice());
        System.out.println("Marke:");
        System.out.println(c1.getBrand());
        System.out.println("Serien Number:");
        System.out.println(c1.getSerielnumber());
        System.out.println("Engine:");
        System.out.println();


    }
}
