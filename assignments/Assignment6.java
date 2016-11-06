/**
 * Assignment 6: HashMaps
 * Due: Sunday, Nov 13 at 11:59 pm
 *
 * This assignment lets you practice HashMaps and sorting.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Assignment6 {

    /**
     * Problem 1: 10 points
     *
     * Fills a HashMap with the numbers 1 through 100 as keys, and whether
     * a given number is divisible by 3 as values.
     *
     * The first several entries should be:
     *     1: false
     *     2: false
     *     3: true
     *     4: false
     *     5: false
     *     6: true
     */
    public static HashMap<Integer, Boolean> enumerateDivisibleBy3() {
        // TODO
        return new HashMap<Integer, Boolean>();
    }




    /**
     * Problem 2: 10 points
     *
     * Returns true if 's' contains at least 10 distinct characters. This method
     * should be case-sensitive (i.e. uppercase letters are distinct from
     * lowercase letters).
     *
     * For example, 'hellohello' would result in false because
     * it only has 4 distinct letters: h, e, l, and o
     *
     * Hint: what are methods that you can use to count how many entries
     * are in a HashMap?
     * https://docs.oracle.com/javase/7/docs/api/java/util/HashMap.html
     */
    public static boolean hasAtLeast10Distinct(String s) {
        // TODO
        return false;
    }



    /**
     * Problem 3: 10 points
     *
     * Counts the occurrences of uppercase As, Bs, and Cs in 's'. The HashMap
     * should not contain entries for any other letters.
     *
     * Example: if given the string "BALLOON", this function should return a
     * HashMap containing:
     *     A: 1
     *     B: 1
     */
    public static HashMap<Character, Integer> countAsBsandCs(String s) {
        // TODO
        return new HashMap<Character, Integer>();
    }



    /**
     * Problem 4: 16 points
     *
     * Compresses a sequence of coin tosses. Each run of heads (H) or tails (T)
     * should be replaced by the letter (H or T) and the number of occurrences.
     *
     * For example, the sequence of coin tosses "HHHTTTTTH" would be compressed
     * as "H3T5H1".
     *
     * Hint: this is an example of a problem where it's *not* helpful to use a
     * HashMap.
     */
    public static String compressCoinTosses(String coinTosses) {
        // TODO
        return "";
    }



    /**
     * Problem 5: 10 points
     *
     * Creates a lookup table from zip codes to city names. The ith zip code in
     * 'zipCodes' matches the ith city in 'cities'.
     *
     * For example, if given zipCodes = ["74074", "37219"] and cities =
     * ["Stillwater, OK", "Nashville, TN"], this function should return a
     * HashMap with the following key-value pairs:
     *   74074: Stillwater, OK
     *   37219: Nashville, TN
     */
    public static HashMap<String, String> createZipLookup(
            ArrayList<String> zipCodes, ArrayList<String> cities) {
        // TODO
        return new HashMap<String, String>();
    }



    /**
     * Problem 6: 14 points
     *
     * Returns true if all of the words in 'sentence' are valid words.
     * 'dictionary' is a provided HashSet that contains all of the valid
     * words for a particular dictionary.
     *
     * You can think of HashSets like HashMaps that don't have any values.
     * They're useful because you can check for the presence of keys. See the
     * HashSet documentation here:
     * https://docs.oracle.com/javase/7/docs/api/java/util/HashSet.html
     *
     * Example: if 'sentence' is 'happy dog cat' and 'dictionary' is ['dog', 'cat'],
     * the function should return false because happy is not in the dictionary.
     *
     * Hint: use the split() method in the String class to break up 'sentence'
     * into individual words.
     * http://docs.oracle.com/javase/7/docs/api/java/lang/String.html#split(java.lang.String)
     */
    public static boolean allValidWords(String sentence, HashSet<String> dictionary) {
        // TODO
        return false;
    }


    /**
     * Problem 7: 10 points
     *
     * 'stateToCities' is a HashMap where the keys are state abbreviations
     * and the values are lists of cities in that state. This function takes
     * that HashMap and creates a new, simpler version where the keys are
     * state abbreviations and the values are how many cities were in the list.
     *
     * For example, if 'stateToCities' was:
     *   'AK': ['Anchorage', 'Juneau']
     *   'NY': ['Albany', 'NYC', 'Syracuse']
     *
     * then the function should return:
     *   'AK': 2
     *   'NY': 3
     */
    public static HashMap<String, Integer> countCities(
            HashMap<String, ArrayList<String>> stateToCities) {
        // TODO
        return new HashMap<String, Integer>();
    }




    /**
     * Used for problem 8. Do not change.
     */
    public static class Dog {
        private double tailWag;

        public Dog(double tailWag) {
            this.tailWag = tailWag;
        }

        public double getTailWag() {
            return tailWag;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || o.getClass() != Dog.class) {
                return false;
            }
            return this.tailWag == ((Dog) o).tailWag;
        }
    }

    /**
     * Problem 8: 20 points
     *
     * Sorts an array of Dogs in descending order by tailWag. Uses insertion sort
     * (no use of built-in or other prewritten sorting libraries allowed).
     */
    public static void sort(Dog[] dogs) {
        // TODO
    }




    /**
     * EXTRA CREDIT: 12 points
     *
     * Badly hashes a String by returning the product of its ASCII character values
     * mod 491.
     *
     * Example: given "hello", this function would return 116 which is
     * (104 * 101 * 108 * 108 * 111) % 491
     *
     * Hint: you'll quickly run into overflow problems (the numbers you're
     * multiplying will quickly become too large to fit into an int, which
     * turns the int negative). To solve this, use this property:
     *   (a mod n)(b mod n) == ab mod n
     * https://en.wikipedia.org/wiki/Modular_arithmetic#Remainders
     *
     * Why is this hash dumb? Because by using the product of the char values,
     * a String like "abc" will hash to the same value as "cba".
     */
    public static int dumbHash(String s) {
        // TODO
        return 0;
    }
}
