package javaadvanced._6;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Month;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }

    private enum YouCanUseClassLocalEnumsLikeThis {
        THIS_CAN_ONLY_BE_ACCESSED_IN_THIS_CLASS,
        THIS_TOO
    }

    /**
     * 1:
     * <p>
     * <p>
     * Create an enum called "Days" with the values "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY".
     * <p>
     * Loop over the values with Days.values() and print them out.
     */
    private enum Days {
        MONDAY, TUESDAY, WEDNESDAY,THURSDAY, FRIDAY, SATURDAY, SUNDAY;

       static Boolean isWeekend;

        static void IsWeekend(Days day){
            switch (day){
                case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> {
                    isWeekend = false;
                    System.out.println("Is weekend? "+isWeekend);
                }
                case SATURDAY, SUNDAY -> {
                    isWeekend= true;
                    System.out.println("Is weekend? "+ isWeekend);
                }
            }
            }
        }


    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        for (Days day : Days.values()) {
            System.out.println(day);

        }

    }

    /**
     * 2:
     * <p>
     * <p>
     * Create an enum called "Seasons" with the values "SPRING", "SUMMER", "FALL", "WINTER".
     * <p>
     * Write a method that takes a Seasons value as input and returns the corresponding date range of months in that season.
     */
    private enum Seasons {
        SPRING(Month.of(3), Month.of(6)),
        SUMMER(Month.of(6), Month.of(9)),
        FALL(Month.of(9), Month.of(12)),
        WINTER(Month.of(12), Month.of(3));
        Month start;
        Month end;

        Seasons(Month start, Month end) {
            this.start = start;
            this.end = end;
        }
        public static void rangeOfMonths(Seasons season) {
            String range = "La stagione " + season + " dura da " + season.start + " a " + season.end;
            System.out.println(range);
        }
    }
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Seasons.rangeOfMonths(Seasons.SUMMER);
        Seasons.rangeOfMonths(Seasons.FALL);
        Seasons.rangeOfMonths(Seasons.WINTER);
        Seasons.rangeOfMonths(Seasons.SPRING);
    }

    /**
     * 3:
     * <p>
     * <p>
     * Create an enum called "TrafficLight" with the values "RED", "YELLOW", "GREEN".
     * <p>
     * Write code that simulates the behavior of a traffic light. It should take the current state of the traffic light as input and return the next state.
     */

    private enum TrafficLight{
        RED , YELLOW , GREEN;
    public static void behaviorTrafficLight(TrafficLight color) {
        if (color.equals(TrafficLight.RED)) {
            System.out.println("Semaforo "+color+ ": Fermati!");
        } else if (color.equals(TrafficLight.YELLOW)) {
            System.out.println("Semaforo "+color+": Rallenta!");
        } else {
            System.out.println("Semaforo "+color+": Prosegui!");
        }
    }
    }

    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        TrafficLight.behaviorTrafficLight(TrafficLight.RED);
        TrafficLight.behaviorTrafficLight(TrafficLight.YELLOW);
        TrafficLight.behaviorTrafficLight(TrafficLight.GREEN);

    }

    /**
     * 4:
     * <p>
     * Given the Days enum from exercise 1, add a local field called isWeekend and set it to true for the weekend days and false for the weekdays.
     * <p>
     * Write an if statement that prints weekend or weekday based on the enum
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        // Your code here
        Days.IsWeekend(Days.MONDAY);
        Days.IsWeekend(Days.SUNDAY);
    }

    /**
     * 5:
     * <p>
     * <p>
     * Create an enum called "Operator" with the values "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE".
     * <p>
     * Write a method that takes two integers and an Operator value as input, performs the corresponding operation on the integers, and returns the result.
     */
        private enum Operator {
            ADD, SUBTRACT, MULTIPLY, DIVIDE;

            static Integer operation(Integer A, Integer B, Operator value){
                int result=0;
                if (value.equals(ADD)) { result = A + B;}
                if (value.equals(SUBTRACT)) { result = A - B;}
                if (value.equals(MULTIPLY)) { result = A * B;}
                if (value.equals(DIVIDE)) { result = A / B;}
                System.out.println(result);
                return result;
            }
        }


    private static void exercise5() {
        System.out.println("\nExercise 5: ");
        // Your code here
        Operator.operation(6,2,Operator.ADD);
        Operator.operation(10,4,Operator.SUBTRACT);
        Operator.operation(4,2,Operator.MULTIPLY);
        Operator.operation(24,5,Operator.DIVIDE);
    }

}
