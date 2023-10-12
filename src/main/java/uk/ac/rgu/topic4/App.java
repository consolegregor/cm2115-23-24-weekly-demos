package uk.ac.rgu.topic4;

public class App {


    public static void main(String[] args){
        Ostrich o = new Ostrich();
    }

    public static void acceptCanFly(CanFly instance){
        instance.fly();
        instance.peck();
    }

    public static void acceptCanPeck(CanPeck instance){
        instance.peck();
    }
}
