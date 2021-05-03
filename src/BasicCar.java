import java.util.ArrayList;
import java.util.List;

public class BasicCar {

    private String color;
    private String price;
    private String brand;
    private String Serielnumber;
    private List<Mirror> mirrors;
    public Engine engine;

    public BasicCar(String color, String price, String brand, String serielnumber, Engine engine) {
        this.color = color;
        this.price = price;
        this.brand = brand;
        this.Serielnumber = serielnumber;
        this.mirrors = new ArrayList<>();
        this.engine = engine;
    }

    public void addMirror(Mirror rearMirror) {
        this.mirrors.add(rearMirror);
    }

    public List<Mirror> getMirrors() {
        return mirrors;
    }

    public BasicCar() {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSerielnumber() {
        return Serielnumber;
    }

    public void setSerielnumber(String serielnumber) {
        Serielnumber = serielnumber;
    }

    public void setMirrors(List<Mirror> mirrors) {
        this.mirrors = mirrors;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
