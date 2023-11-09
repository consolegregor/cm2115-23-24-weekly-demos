package uk.ac.rgu.topic5;

public class Person{
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age){
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
    }

    public String getfirstName(){
        return this.firstName;
    }

      public String getlastName(){
        return this.lastName;
    }

      public int getAge(){
        return this.age;
    }

    public String toString(){
        return getfirstName() + " " + getlastName() + " " + getAge();
    }
}


