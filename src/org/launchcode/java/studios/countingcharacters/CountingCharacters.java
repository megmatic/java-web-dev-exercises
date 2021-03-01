package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {

    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
        String sentence = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        char[] charactersInString = sentence.toCharArray();
        HashMap<Character, Integer> charactersCounted = new HashMap<>();

        for (Character characterInString : charactersInString) {
            if (charactersCounted.containsKey(characterInString)) {
                charactersCounted.merge(characterInString, 1, Integer::sum);
            } else {
                charactersCounted.put(characterInString, 1);
            }
        }

        for (Map.Entry<Character, Integer> characterCounted : charactersCounted.entrySet()) {
            System.out.println(characterCounted.getKey() + ": " + characterCounted.getValue());
        }

    }

}
