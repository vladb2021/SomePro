package vehicles;

public class Vehicle {

    private String color;
    private byte doors;
    private byte wheels;
    private int speed;

    public Vehicle() {}

    public Vehicle(String color, byte doors, byte wheels) {
        this.color = color;
        this.doors = doors;
        this.wheels = wheels;
        this.speed = 0;
    }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public byte getDoors() { return doors; }
    public void setDoors(byte doors) { this.doors = doors; }
    public byte getWheels() { return wheels; }
    public void setWheels(byte wheels) { this.wheels = wheels; }
    public int getSpeed() { return speed; }
    public void setSpeed(int speed) { this.speed = speed; }

    public void steeringLeft() {
        System.out.println("You are turning left");
    }
    public void steeringRight() {
        System.out.println("You are turning right");
    }
    public void steeringStraight() {
        System.out.println("Steering wheel returned, you are driving straight");
    }
    public void currentSpeed() {
        System.out.println("Your current speed is: " + speed);
    }
    public void increaseSpeed(int speed) {
        this.speed += speed;
        System.out.println("Your current speed is: " + this.speed);
    }
    public void decreaseSpeed(int speed) {
        if (this.speed < speed) {
            this.speed = 0;
            System.out.println("You are stopped, speed = 0");
        } else {
            this.speed -= speed;
            System.out.println("Your current speed is: " + this.speed);
        }
    }
}