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

        displayBook();
        createBook();
        displayBook();

        programPause();
        windowClear();
    }

    // Create a book :
    private static void createBook() {
        Book firstBook = new Book();
        firstBook.title = "Coding is art.";
        firstBook.author = "Becky James";
        firstBook.numberOfPages = 425;

        firstBook.numberOfPages += 10;

        System.out.println("\nCreated First Book :");
        System.out.println("title : " + firstBook.title); 
        System.out.println("Author : " + firstBook.author);
        System.out.println("Number of pages : " + firstBook.numberOfPages);
        System.out.println("Publisher : " + firstBook.publisher);
    }


    // Display book properties :
    private static void displayBook() {
        System.out.println("\nDisplay Book :");

        // The following lines doesn't work :
        //System.out.println("title : " + firstBook.title); 
        //System.out.println("Author : " + firstBook.author);
        //System.out.println("Number of pages : " + firstBook.numberOfPages);
        //System.out.println("Publisher : " + firstBook.publisher); 
        
        System.out.println("title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Number of pages : " + numberOfPages);
        System.out.println("Publisher : " + publisher);
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
}

/*

1) Go to the program root :
cd C:/Users/Jaenne/Documents/java_cours

2) Compile :
javac bookLibrary/Book.java

3) Execute :
Java bookLibrary.Book

*/