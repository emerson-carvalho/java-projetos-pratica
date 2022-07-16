package exercism.cars;

class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar>  {

    private int speed = 10;
    private int distanceTravelled;
    private int numberOfVictories;

    public void drive() {
        this.distanceTravelled += speed;
    }

    public int getDistanceTravelled() {
        return this.distanceTravelled;
    }

    public int getNumberOfVictories() {
        return this.numberOfVictories;
    }

    public void setNumberOfVictories(int numberofVictories) {
        this.numberOfVictories = numberofVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar car) {
        return Integer.compare(this.getNumberOfVictories(), car.getNumberOfVictories());
    }
}