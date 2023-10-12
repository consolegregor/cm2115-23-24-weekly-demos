package uk.ac.rgu.topic4;

public class Bird implements CanPeck {

 
    public void somethingABirdCanDo(){
        System.out.println("Bird is doing something");
    }

    @Override
    public void peck() {
        System.out.println("Bird is pecking");
    }

    @Override
    public void myDefaultMethod(){

    }
    
}
