package javaadvanced._5;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.InputMismatchException;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    /**
     * 1: Uncomment the Files.createFile() line below and write a try catch block that
     * prints it's stack trace
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        // Your code here
        try {
            Files.createFile(Path.of("Test.txt"));
        } catch (FileAlreadyExistsException exception) {
            System.out.println("The file already exists");
            exception.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }

    /**
     * 2:
     * <p>
     * Write a try-catch block that attempts to open a file
     * <p>
     * In the catch block, print a message that informs the user that the file could not be found.
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        String userInputFileName = "test-file.txt";
        try {
            Files.readString(Path.of(userInputFileName));

        } catch (NoSuchFileException exception) {
            System.out.println("the file could not be found");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    /**
     * 3:
     * <p>
     * Write a try-catch block that attempts to parse a string as an integer.
     * <p>
     * In the catch block, print a message that informs the user that the input was not a valid integer.
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        try {

            Integer.parseInt("house");
        } catch (NumberFormatException exception) {
            System.out.println("the input was not a valid integer");
        }
    }

    /**
     * 4:
     * <p>
     * Write a try block that around this print statement that attempts to divide 2 numbers
     * <p>
     * Create multiple catch blocks that catch different types of exceptions, such as NumberFormatException and DivideByZeroException.
     * <p>
     * In each catch block, print a message that informs the user of the specific exception that was caught and why it occurred.
     */
    private static <DivideByZeroException> void exercise4() {
        System.out.println("\nExercise 4: ");
        // Your code here

        Integer num1 = 10;
        String num2AsString = "0.0";
        try {

            System.out.println(num1 / Integer.parseInt(num2AsString));

        } catch (NumberFormatException exception) {
            System.out.println("Invalid number format");
            exception.printStackTrace();

        }

    }
}

