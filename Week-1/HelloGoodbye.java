/*
Write a program HelloGoodbye.java that takes two names as command-line arguments and prints hello and goodbye messages as shown below
- Names for the hello message must be in the same order as the command-line arguments
- Names for the goodbye message must be in a reverse order
*/

public class HelloGoodbye {
    public static void main(String[] args) {
        System.out.println("Hello " + args[0] + " and " + args[1] + ".");
        System.out.println("Goodbye " + args[1] + " and " + args[0] + ".");
    }
}
