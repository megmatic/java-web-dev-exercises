package exercies;
import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("what's the length of this ambiguous rectangle??");
        int length = input.nextInt();
        System.out.println("cool, now what's the width??");
        int width = input.nextInt();

        int area = length * width;

        System.out.println("Hey hey hey! The area of your rectangle is " + area);



    }


}
