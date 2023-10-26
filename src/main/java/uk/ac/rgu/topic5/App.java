package uk.ac.rgu.topic5;

public class App {
    
    public static void main(String[] args){

        App app = new App();


        String[] myArray = {"Peter Parker", "Carol Danvers", "Steve Rogers", "Wanda Maximoff"};


        String myString = "Hello world";
        int myInt = 3;
    }

    /**
     * Instance method, to illustrate how method references work inside the same
     * object
     */
    public void run(){

    }

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
