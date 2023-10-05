package uk.ac.rgu.topic3;

public class App {

    public static void main(String[] args){
        
        Bird bird = new Bird("tweety");
        System.out.println(bird.makeSound());

        Cat cat = new Cat("Sylvester");
        System.out.println(cat.makeSound());

        System.out.println(cat.getName());

        cat.useLitterTray();

        Animal anotherCat = new Cat("Terrance");

        System.out.println(anotherCat.makeSound());
        System.out.println(anotherCat.getName());

        //anotherCat.useLitterTray();

        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Odie");
        animals[1] = new Cat("Garfield");
        animals[2] = new Horse("Jeff");

        for(int i=0;i<animals.length;i++){
            System.out.println(animals[i].makeSound());
        }

    }
}
