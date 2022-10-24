import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tutorial 1\n\n");

        System.out.println("Ex 1\n");
        System.out.println("Welcome to Online Learning!\n");
        System.out.println("Please virus go away!");

        System.out.println("Ex 2\n");
        //null

        System.out.println("Ex 3\n");
        for (int a = 2; a < 99; a = a + 2) {
            System.out.println(a);
        }

        System.out.println("Ex 4\n");
        int b = 2;
        while (b < 99) {
            System.out.println(b);
            b = b + 2;
        }

        System.out.println("Ex 5\n");
        //null

        System.out.println("Ex 6\n");

        Random random = new Random();

        int[] list = new int[6];
        int num;

        for (int c = 0; c < 6; c++) {
            num = random.nextInt(1, 49);
            for (int d = 0; d < c; d++) {   //check if new random number is same as old one in list
                if (list[d] == num) {
                    num = random.nextInt(1, 49);
                    d -= 1;     //redo same loop if same
                }
            }
            list[c]=num;
        }

        System.out.println("Unique lottery numbers are - ");
        for (int f : list) {
            System.out.print(f + "\s");
        }

    }
}
