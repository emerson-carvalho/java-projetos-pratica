package exercism.cars;

public class ExperimentalRemoteControlCar implements RemoteControlCar {

    int speed = 20;
    int distanceTravelled;

    public void drive() {

        this.distanceTravelled += speed;
    }

    public int getDistanceTravelled() {

        return this.distanceTravelled;
    }
}
