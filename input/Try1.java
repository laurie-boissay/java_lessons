package input;

// https://www.w3schools.com/java/java_user_input.asp
// http://www.france-ioi.org/algo/task.php?idChapter=843&iOrder=2

import java.util.Scanner;  // Import the Scanner class

    class Try1 {
        public static void main(String[] args) {
            Scanner entry = new Scanner(System.in);
            System.out.println("Entrez votre nom :\n");

            String name = entry.nextLine();  // Read user input
            System.out.println("\nVotre nom est : " + name);
        }
    }

/*
cd C:/Users/Jaenne/Documents/java_cours
javac input/Try1.java
Java input.Try1
*/