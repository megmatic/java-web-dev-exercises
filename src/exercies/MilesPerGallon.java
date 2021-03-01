package exercies;

import java.util.Scanner;

public class MilesPerGallon {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("how many miles did you drive??");
        int miles = input.nextInt();
        System.out.println("cool, how many gallons of gas did you consume??");
        int gallons = input.nextInt();

        int mpg = miles / gallons;

        System.out.println("your mpg is " + mpg);
    }
}
