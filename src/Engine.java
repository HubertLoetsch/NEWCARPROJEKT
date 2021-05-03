public class Engine {

    public enum TYPE {DIESEL,GAS}
    public TYPE type;
    private int basicconsumption;
    private int horsePower;
    private int maxSpeed;

    public Engine (int horsePower,TYPE type){
        this.horsePower = horsePower;
        this.type = type;
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }

    public int getBasicconsumption() {
        return basicconsumption;
    }

    public void setBasicconsumption(int basicconsumption) {
        this.basicconsumption = basicconsumption;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
