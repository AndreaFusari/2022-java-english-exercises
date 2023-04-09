package javaadvanced._4;

import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exercises {

    private static final Path MY_PATH = Paths.get("file.txt");
    private static final Path PATH_IN_A_FOLDER = Paths.get("mydirectory/file.txt");

    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }

    // Use the MY_PATH constant

    /**
     * 1:
     * Write a method that writes myString to a file
     * writes to a file
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        String myString = """
                The quick brown fox jumps over the lazy dog
                """;

        try {
            // Your code here
            Files.writeString(MY_PATH, myString);

        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
    }

    /**
     * 2:
     * Write a method that reads the file from exercise 1
     * then prints it out
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        try {
            // Your code here
            String fileDaLeggere = Files.readString(MY_PATH);
            System.out.println(fileDaLeggere);

        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }


    }

    /**
     * 3:
     * Write a method that reads a file and print the number of lines in the file
     */

    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Write code here to read the file and return the number of lines "\n", string.split
        try {
            // Your code here
            String myString = Files.readString(MY_PATH);
            int numLines = myString.split("\n").length; //.split restituisce un array di stringhe, ogni elemento è delimitato dal "\n",
            // .lenght ci dice la lunghezza dell'array e quindi in questo caso il numero di linee presenti nel nostro file
            System.out.println("Number of lines in file: " + numLines);


        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
    }

    /**
     * 4:
     * Write a method that reads a file and returns the number of words in the file
     * <p>
     * Then deletes the previous file with Files.delete() use inside the try block
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        try {
            // Your code here
            // FileWriter writer = new FileWriter("prova.txt");
            //writer.write("ciaosddjdof \n jdkf jdjddj jddj \n fjjjgjgdj jdj oroe cjskak");
            //writer.close();
            //File file = new File("prova.txt");
            //Path mypath = Path.of("prova.txt");
            var mypath = Path.of("prova.txt");
            Files.writeString(mypath, "ciaosddjdof \n jdkf jdjddj jddj \n fjjjgjgdj jdj oroe cjskak");
            String myString = Files.readString(mypath);
            int numbersOfWords = myString.split(" ").length;
            System.out.println("Nel file prova.txt ci sono " + numbersOfWords + " parole.");
            Files.delete(mypath);


        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
    }

    /**
     * 5:
     * Using the `myDirectoryPath` and Files.createDirectory, fix the code below
     */
    private static void exercise5() {
        System.out.println("\nExercise 5: ");
        Path myDirectoryPath = Path.of("mydirectory");

        try {
            // Your code
           // Files.createDirectory(myDirectoryPath);
            Files.writeString(PATH_IN_A_FOLDER, "Why am I in a folder?");
            Files.delete(PATH_IN_A_FOLDER);
        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
    }
}
