package uk.ac.rgu.topic4;

public class Eagle extends Bird implements CanFly{

    @Override
    public void fly() {
        System.out.println("Eagle is flying");
    }
    
}
