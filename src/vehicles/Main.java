package vehicles;

public class Main {
    public static void main(String[] args) {

        SuperCar car = new SuperCar();
        car.engineOn();
        car.increaseGear();
        car.increaseSpeed(20);
        car.increaseGear();
        car.currentGear();
        car.increaseSpeed(50);
        car.steeringLeft();
        car.currentSpeed();
        car.steeringStraight();
        car.boostOn();
        car.boostOff();
        car.decreaseSpeed(100);
    }
}