package exercism.cars;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestTrack {

    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(ProductionRemoteControlCar prc1, ProductionRemoteControlCar prc2) {

        List<ProductionRemoteControlCar> rankedCars = Arrays.asList(prc1, prc2);
        Collections.sort(rankedCars);
        return rankedCars;
    }
}


