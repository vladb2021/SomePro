package vehicles;

public class SuperCar extends Car {

    boolean boostStatus;

    public SuperCar() {
        super();
        this.boostStatus = false;
        this.setWheels((byte) 6);
    }

    public void boostOn() {
        boostStatus = true;
        System.out.println("Boost activated");
    }
    public void boostOff() {
        boostStatus = false;
        System.out.println("Boost deactivated");
    }
}