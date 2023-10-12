package uk.ac.rgu.topic4;

public abstract class PassengerVehicle {
    
    protected int maxPassengers;

    public PassengerVehicle(int maxPassengers){
        this.maxPassengers = maxPassengers;
    }

    public int getMaxPassengers(){
        return this.maxPassengers;
    }
}
