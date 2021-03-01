package exercies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList<Integer> someIntegers = new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        ArrayList<String> someWords = new ArrayList(Arrays.asList("hey", "now", "this", "is", "what", "dreams", "are", "made", "of"));

        System.out.println(sumEven(someIntegers));

        Scanner input = new Scanner(System.in);
        System.out.println("What length do you want to print out??");
        int pickedLength = input.nextInt();

        printWords(someWords, pickedLength);
    }

    public static int sumEven(ArrayList<Integer> arr) {
        int sum = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }

    public static void printWords(ArrayList<String> arr, Integer num) {

        for (String word : arr) {
            if (word.length() == num) {
                System.out.println(word);
            }
        }
    }

}
