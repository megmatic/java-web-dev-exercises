package exercies;


import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

    public static void main(String[] args) {

        int[] intArray = {1, 1, 2, 3, 5, 8};

        for (int num : intArray) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }

        String longStr = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] longStrArray = longStr.split(" ");
        for (String word : longStrArray) {
            System.out.println(word);
        }

        String[] lines = longStr.split("\\.");
        for (String line : lines) {
            System.out.println(line);
        }

        //System.out.println(Arrays.toString(longStrArray));

    }


}
