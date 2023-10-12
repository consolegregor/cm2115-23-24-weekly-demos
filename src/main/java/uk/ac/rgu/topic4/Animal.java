package uk.ac.rgu.topic4;

public abstract class Animal {
    
    protected String name;

    public Animal(String name){
        this.name = name;
    }

    /**
     * Returns the name of this animal
     * Declared as final because we don't want sub-classes
     * overriding it
     * @return
     */
    public final String getName(){
        return this.name;
    }

    /**
     * Method to return the sound this animal makes
     * Abstract because different animals make different sounds
     * @return
     */
    public abstract String makeSound();





}
