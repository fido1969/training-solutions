package week07d05;

public class Truck extends Vehicle{

    public Truck() {
        super(5, TransmissionType.MANUAL);
    }
    public Truck(int numberOfGears, TransmissionType transmissionType) {
        super(numberOfGears, transmissionType);
    }


}
