package javabasics._4;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();

    }

    /**
     * 1: Store your age in an appropriate variable, print it out in
     *    one line using the "+" in your print statement. Only use 1 print statement
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        // Write your code here
        int myAge = 30;
        System.out.println("My age= "+myAge);
    }

    /**
     * 2: Store your first name initial (i.e. Jane -> J) in a variable, your age in another variable.
     *
     *    And then print them out on the same line using the following idea
     *
     *    System.out.println("My Age=" + myAge +", my initial=" + myInitial);
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        //Write your code here
        int myAge = 30;
        char myInitial = 'A';
        System.out.println("My Age=" + myAge +", my initial=" + myInitial);
    }

    /**
     * 3: Write comments above each line of code, describing what the line of code is doing
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        boolean hasEatenLunch = false;// inizializza variabile hasEatenLunch

        double lunchCost = 5.99;// inizializza variabile lunchCost

        System.out.println("Lunch cost=" + lunchCost); // stampa variabile lunchCost
        System.out.println("Has Eaten lunch=" + hasEatenLunch); // stampa variabile hasEatenLunch
    }
}
