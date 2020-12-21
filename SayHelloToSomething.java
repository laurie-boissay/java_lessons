package hello;

/*
A simple program to say "Hello world".
*/

public class SayHelloToSomething {
    // Global scope constant :
    static String sayHello = "\nHello ";
    // Why the following line does not work ?
    // String sayHello = "\nHello ";

    // The program starts here :
    public static void main(String[] args) {
        windowClear();
        sayHelloTo("world");
        sayHiTo("people");
        displayDocumentationLink();
        loopCounter();
        programPause();
        windowClear();
    }

    // Displays "Hello ..."
    private static void sayHelloTo(String recipient) {  
        System.out.println(sayHello.toUpperCase() + recipient.toUpperCase() + " !");
        System.out.println(sayHello.toLowerCase() + recipient.toLowerCase() + " !");
    }

    // Displays "Hi ..."
    private static void sayHiTo(String recipient) {
        // Local scope variable :
        String anotherRecipient = "Ada";
        // Why the following line does not work ?
        // static String anotherRecipient = "Ada";

        sayHello += recipient + " !"; 
        sayHello = sayHello.replace("Hello", "Hi");
        System.out.println(sayHello.toUpperCase());

        sayHello = sayHello.replace(recipient, anotherRecipient);
        System.out.println(sayHello);
    }

    // Displays a link to the documentation.
    private static void displayDocumentationLink() {
        String link = "https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html";
        System.out.println("\nTo learn more about \"String\", please, visit :\n" + link + "\n");
    }

    // Runs 3 kind of loop.
    private static void loopCounter() {
        int i = 1;
        while (i <= 5) {
            printCounter(i);
            i++;
        }

        System.out.println("\n");

        for (int j = 1; j <= 5; j++) {
            printCounter(j);
        }

        System.out.println("\n");

        int k = 5;
        do {
            printCounter(k);
        }
        while(k < 5);
    }

    // Stops the program (Windows).
    private static void programPause() {
        System.out.println("\nPress the ENTER key to leave and clear.");
        new java.util.Scanner(System.in).nextLine();
    }

    // Clears the console (Windows cygdrive).
    private static void windowClear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // Displays counter.
    private static void printCounter(int counter) {
        System.out.println("Counter : " + counter + ".");
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