package uk.ac.rgu.topic3;

public class Cat extends Animal {
    
    public Cat(String name) {
        super(name);
    }

    public String makeSound(){
        return "Meow";
    }

    public void useLitterTray(){
        System.out.println(this.name + " is using the litter tray");
    }

}
