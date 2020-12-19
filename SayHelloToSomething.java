package hello;

/*
A simple program to say "Hello world".
*/

public class SayHelloToSomething {

    // The program starts here :
    public static void main(String[] args) {
    	windowClear();
        sayHelloTo("world");
        programPause();
        windowClear();
    }

    // Display "Hello ..."
    private static void sayHelloTo(String recipient) {
        String sayHello = "\nhello world !";
        String link = "https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html";

        System.out.println(sayHello.toUpperCase());
        System.out.println(sayHello.toLowerCase());
        System.out.println(sayHello.replace("hello", "Hi"));
        System.out.println("\nTo learn more about \"String\", please, visit :\n" + link);
    }

    // Stop the program (Windows).
    private static void programPause() {
        System.out.println("\nPress any key to leave and clear.");
        new java.util.Scanner(System.in).nextLine();
    }

    // Clear the console (Windows cygdrive).
    private static void windowClear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}


/*

### HOW TO RUN THE PROGRAM WITHOUT IDE? ###

1) Go to the program root :
cd C:/Users/Jaenne/Documents/java_cours/hello_world
cd C:\Users\Jaenne\Documents\java_cours\hello_world

2) Compile :
javac hello/SayHelloToSomething.java
javac hello\SayHelloToSomething.java

3) Execute :
Java hello.SayHelloToSomething

*/



