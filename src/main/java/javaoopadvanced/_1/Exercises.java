package javaoopadvanced._1;

import java.util.ArrayList;
import java.util.List;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1:
     * <p>
     * <p>
     * Create a class called "Dog" that extends the Animal class.
     * <p>
     * Add a new field called "breed" to the Dog class.
     * <p>
     * Write a constructor for the Dog class that takes in a breed, height, and weight as parameters, and passes the height and weight to the superclass constructor.
     * <p>
     * Write getters and setters for the breed field.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
    }

    /**
     * 2:
     * Create new classes called "Fish" and "Bird" that extends the Animal class.
     * <p>
     * Add a new field called "species" to the Fish class and "wingSpan" to the Bird class.
     * <p>
     * Also create constructors, getters and setters
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
    }


    /**
     * 3:
     * <p>
     * In the dog class create a method called runSpeedMetersPerSecond() that returns the Dog's Height * 2
     * In the fish class create a method called swimSpeedMetersPerSecond() that returns the Fish's Weight * 2
     * In the bird class create a method called flySpeedMetersPerSecond() that returns the Bird's Wingspan * 4
     * <p>
     * Create instances of each Animal: Dog, Fish and Bird. Fill the constructors with values of your choice
     * and print out which of the animals has the fastest movement speed in MetersPerSecond
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        Dog dog = new Dog(25.0, 50.0, "Doberman");
        Fish fish = new Fish(50.0, 150.0, "Shark");
        Bird bird = new Bird(70.0, 30.0, 300);

        double[] movementSpeed = new double[]{dog.runSpeedMetersPerSecond(), fish.swimSpeedMetersPerSecond(), bird.flySpeedMetersPerSecond()};
        double fastestMovementSpeed = 0.0;

        for (double v : movementSpeed) {
            fastestMovementSpeed = Math.max(v, fastestMovementSpeed);

        }

        if (fastestMovementSpeed == dog.runSpeedMetersPerSecond()) {
            System.out.println(dog.getBreed() + " è l'animale più veloce: " + dog.runSpeedMetersPerSecond() + "m/s");
        }
        if (fastestMovementSpeed == fish.swimSpeedMetersPerSecond()) {
            System.out.println(fish.getSpecies() + " è l'animale più veloce: " + fish.swimSpeedMetersPerSecond() + "m/s");
        }
        if (fastestMovementSpeed == bird.flySpeedMetersPerSecond()) {
            System.out.println("L'uccello è l'animale più veloce: " + bird.flySpeedMetersPerSecond() + " m/s");
        }


    }
}

