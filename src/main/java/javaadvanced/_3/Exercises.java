package javaadvanced._3;

import java.util.*;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }


     /**
     * 1: Complete the function that removes any duplicates by using a set
     *    then recreates a new list of unique items
      *
      *   You can reset a list by using list = new ArrayList<>();
     */
    private static void exercise1() {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "a", "b", "c", "a", "b", "c"));

        Set<String> setList = new HashSet<>();  // Your code here
        setList.addAll(list);
        list=new ArrayList<>(setList);

        if (list.size() == 3) {
            System.out.println("Exercise 1: Success");
        } else {
            System.out.println("Exercise 1: Failed");
        }
    }

    /**
     * 2: Write a method that takes a List of Strings or a Set of Strings and returns a Set of Strings.
     *    the method should take a collection as a parameter
     */
    private static void exercise2() {
        // Your code here
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "kiwi", "banana");
        Set<String> set = Set.of("apple", "banana");
        // toSet(list); <-- uncomment
        Set<String>setSet=toSet(set);
    }


    // Write your method for exercise 2 here
    private static Set<String> toSet(Collection<String>collection) {

        return new HashSet<>(collection);
    }


    /**
     * 3: Follow the instructions in the comments
     */
    private static void exercise3() {
        String str = "the fox and the lazy dog saw another fox with another not lazy dog";
        List<String> words = Arrays.stream(str.split(" ")).toList();
        Map<String, Integer> wordCount = new HashMap<>();

        // Write code to count the number of occurrences of each word in the String `words`
        // and store the counts in the Map `wordCount`, note you will need to first get the previous value
        // from the Map and then increment it by 1, if no previous value exists, use 0 as the previous value.

        // Your code here
        for (String word : words) {
            Integer count = wordCount.getOrDefault(word, 0); //getOrDefault ritorna il valore associato a una key
            // ,se la key non è presente nella map imposta il valore di default a 0
            wordCount.put(word, count + 1);
        }
        System.out.println(wordCount);
    }


       /*for (String word : words) {
            wordCount.put(word, 0);
        }
        for (String word : words) {
            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                if (entry.getKey().equals(word)) {
                    entry.setValue(entry.getValue()+1);
                }
            }
        }
        System.out.println(wordCount);

    }*/

    /**
     * 4: Answer the following questions
     *
     *    What is the best data structure to use in the following scenarios, chose either a List, Set or Map
     *    and explain why you chose that data structure.
     *
     *    1 - You want to store the students in order of their arrival
     *    Answer: list
     *
     *    2 - You want to store the students in a class and their grades
     *    Answer: map
     *
     *    3 - You want to store the countries in the world in order of age
     *    Answer: treemap
     *
     *    4 - You want to store the products available for purchase in an online store, along with their corresponding prices.
     *    Answer: map
     *
     *    5 - You want to store the employees at a company in the order you added them
     *    Answer: list
     *
     *    6 - You want to store the cities in a particular state, along with their populations.
     *    Answer: map
     *
     *    7 - You want to store the books in a library, along with their authors and publication dates.
     *    Answer: list
     *
     *    8 - You want to store the courses offered at a university, along with the professors teaching each course.
     *    Answer: map
     *
     *    9 - You want to store the movies in a movie rental store, along with their ratings and release dates.
     *    Answer: list
     *
     *    10 - You want to store the flights available for booking on an airline, along with their destinations and departure times.
     *    Answer: list
     *
     *    11 - You want to store the articles on a news website, along with their titles and publication dates.
     *    Answer: list
     *
     *    12 - You want to store the songs in a music streaming service, along with their artists and album names.
     *    Answer: set
     */

    }

