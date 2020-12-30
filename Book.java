package bookLibrary;

/*
How to declare, use a class ?
https://openclassrooms.com/fr/courses/6173501-debutez-la-programmation-avec-java/6458101-definissez-les-objets-et-leurs-attributs-avec-des-classes
*/


public class Book {

    // Class properties :
    static String title;
    static String author;
    static int numberOfPages;
    static String publisher = "OpenClassrooms";


    // The program starts here :
    public static void main(String[] args) {
        windowClear();
        
        displaySomething();
        //createNewBook(); // ERROR : required: no arguments !!!
        //changeValue(); // Doesn't work cause of createNewBook().

        programPause();
        windowClear();
    }

    // Display something to test the program :
    private static void displaySomething() {
        System.out.println(publisher);
    }

    // Create a book :
    /*
    private static void createNewBook() {
        Book firstBook = new Book("Coding is art", "Becky James", 425);
        System.out.println(firstBook.title);
    }
    */

    // Change a value :
    /*
    private static void changeValue() {
        firstBook.numberOfPages = 425;
        System.out.println(firstBook.numberOfPages);
    }
    */

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

}

/*

### HOW TO RUN THE PROGRAM WITHOUT IDE? ###

1) Go to the program root :
cd C:/Users/Jaenne/Documents/java_cours

2) Compile :
javac bookLibrary/Book.java

3) Execute :
Java bookLibrary.Book

*/