package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class CountingCharacters {

    public static void main(String[] args) {

        String sentence = "";

        try {
            File myObj = new File("src/org/launchcode/java/studios/countingcharacters/text.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                sentence += data;
            }
            myReader.close();
        }catch(FileNotFoundException ex) {
            System.out.println(ex);
            System.out.println("OH NO!!");
        }

        System.out.println(sentence);

        sentence = sentence.toLowerCase();

        char[] charactersInString = sentence.toCharArray();
        HashMap<Character, Integer> charactersCounted = new HashMap<>();

        for (Character characterInString : charactersInString) {
            if (!Character.isLetter(characterInString)) {
                continue;
            }
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
