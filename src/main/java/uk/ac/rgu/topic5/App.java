package uk.ac.rgu.topic5;

public class App {
    
    public static void main(String[] args){

        App app = new App();
        instance.run();

        LogFormat verboseLogger = (String msg) -> {
            System.out.println("Verbose " + msg);
        };
        
        verboseLogger.log("Hello World");


        String[] myArray = {"Peter Parker", "Carol Danvers", "Steve Rogers", "Wanda Maximoff"};


        for(int = 0; i < myArray.length; i++){
            System.out.println(myArray[i]); //The normal way of printing an array in JAVA
        }

        for(String name : myArray){
            System.out.println(name); // A Shorter way of printing an array in JAVA
        }

        String myString = "Hello world";
        int myInt = 3;


    Operation add = (x, y) -> x + y;  
    int result = add.perform(1, 2); 
    System.out.println(result);  
    

    GenericsClass<String> c = new GenericsClass<>(myString) //Creating a generics instance
    c.printType;
    //The two number from the Operation class, you don't need the "return" as it is on one line.  Jusy defe what needs to return

    // if we want to use the turn return we would create 
    // Operation add = (x, y) -> {
    // return x + y;
   // };
    
    }

    /**
     * Instance method, to illustrate how method references work inside the same
     * object
     */
    public void run(){
        Operation mult = this::multiply;
        int result = mult.perform(3, 4);
        System.out.println(result);
    }
    //Methods used above ^^^^^

    /**
     * Multiplies the given numbers together
     * Used to illustrate the use of method references
     * @param num1
     * @param num2
     * @return
     */
    public int multiply(int num1, int num2){
        return num1 * num2;
    }

    /**
     * A method that can be used to implement the LogFormat functional interface
     * @param input
     */
    public void printWithEqualsSigns(String input){
        System.out.println("===" + input + "===");
    }

    

}
