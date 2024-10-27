package L.badcase;

public class Wagon extends Car {

    public int calculateInternalSpace(int baggageWeight) {
        return baggageWeight * 4;
    }

    @Override
    public int getFuelCapacity() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
