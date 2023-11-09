package uk.ac.rgu.topic5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class App {
    
    public static void main(String[] args){
        
        
        ArrayList<Person> people = new ArrayList<>();  //Empty list 

        Person[] peopleArray = new Person[3];

        Person p1 = new Person("Gregor", "Robb", 19);
        Person p2 = new Person("Mitchell", "Robb", 21);
        Person p3 = new Person("Wendy", "Robb", 51);
        Person p4 = new Person("Martin", "Robb", 58); //

        people.add(p1);
        people.add(p2);
        people.add(p3);     //This is us creating a collection ArrayList linklists
        people.add(p4);     //Allows use to add these names to the ArrayList

        peopleArray[0] = p1;     //Adding these names into the positions
        peopleArray[1] = p2;
        peopleArray[2] = p3;
        // peopleArray[3] = p4;


        // for(Person p : people){
        //     System.out.println(p);
        // }



        //Maps hashMap is a type of Map 
            Map<String, Person> peopleMap = new HashMap<>();

            peopleMap.put("Gregor", p1);
            peopleMap.put("Mitchell", p2);
            peopleMap.put("Wendy", p3);
            peopleMap.put("Martin", p4);

            Person p = peopleMap.get("Gregor");
            System.out.println(p.toString());
                peopleMap.forEach((key, v)->{
                    System.out.println("key:" + key + "value:" + v.toString());
                });








            // p = peopleMap.get("Mitchell");
            // if(p == null){
            //     System.out.println(p.getlastName());

            //     peopleMap.get("Mitchell").add(p2);

            // }



//         App app = new App();
//         instance.run();

//         LogFormat verboseLogger = (String msg) -> {
//             System.out.println("Verbose " + msg);
//         };
        
//         verboseLogger.log("Hello World");


//         String[] myArray = {"Peter Parker", "Carol Danvers", "Steve Rogers", "Wanda Maximoff"};


//         for(int = 0; i < myArray.length; i++){
//             System.out.println(myArray[i]); //The normal way of printing an array in JAVA
//         }

//         for(String name : myArray){
//             System.out.println(name); // A Shorter way of printing an array in JAVA
//         }

//         String myString = "Hello world";
//         int myInt = 3;


//     Operation add = (x, y) -> x + y;  
//     int result = add.perform(1, 2); 
//     System.out.println(result);  
    

//     GenericsClass<String> c = new GenericsClass<>(myString) //Creating a generics instance
//     c.printType;
//     //The two number from the Operation class, you don't need the "return" as it is on one line.  Jusy defe what needs to return

//     // if we want to use the turn return we would create 
//     // Operation add = (x, y) -> {
//     // return x + y;
//    // };
    
//     }

//     /**
//      * Instance method, to illustrate how method references work inside the same
//      * object
//      */
//     public void run(){
//         Operation mult = this::multiply;
//         int result = mult.perform(3, 4);
//         System.out.println(result);
//     }
//     //Methods used above ^^^^^

//     /**
//      * Multiplies the given numbers together
//      * Used to illustrate the use of method references
//      * @param num1
//      * @param num2
//      * @return
//      */
//     public int multiply(int num1, int num2){
//         return num1 * num2;
//     }

//     /**
//      * A method that can be used to implement the LogFormat functional interface
//      * @param input
//      */
//     public void printWithEqualsSigns(String input){
//         System.out.println("===" + input + "===");
//     }

    

    }

}
