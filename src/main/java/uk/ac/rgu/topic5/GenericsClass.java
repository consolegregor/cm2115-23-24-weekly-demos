package uk.ac.rgu.topic5;

public class GenericsClass<T>{
    String myString;

    T myType;

    public GenericsClass(T param){
        this.myType = param;
    }

    public void printType(){
        System.out.print(myString);
    }
    
    
}


//This must be upper case and you can have multiple, to declare a type instead of using String myString ; we can use T myType;