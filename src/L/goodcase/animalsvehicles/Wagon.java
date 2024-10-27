package L.goodcase.animalsvehicles;

import L.goodcase.AnimalPoweredVehicles;

public class Wagon extends AnimalPoweredVehicles {

    public int calculateInternalSpace(int baggageWeight) {
        return baggageWeight * 4;
    }

}
