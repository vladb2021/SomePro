package vehicles;

public class Car extends Vehicle {

    private byte gear;
    private boolean engineStatus;

    public byte getGear() { return gear; }
    public void setGear(byte gear) { this.gear = gear; }

    public Car() {
        super();
        engineStatus = false;
        this.setWheels((byte) 4);
        this.setGear((byte) 0);
    }

    public void currentGear() {
        System.out.println("You current gear is: " + getGear());
    }
    public void increaseGear() {
        if (gear == 5) {
            System.out.println("You are reached maximum gear");
        } else {
            setGear(++gear);
            System.out.println("Your gear is increased");
        }
    }
    public void decreaseGear() {
        if (gear == -1) {
            System.out.println("You are reached minimum gear");
        } else {
            setGear(--gear);
            System.out.println("Your gear is decreased");
        }
    }
    public void engineOn() {
        engineStatus = true;
        System.out.println("Engine is turned on");
    }
    public void engineOff() {
        engineStatus = false;
        System.out.println("Engine is turned off");
    }
}