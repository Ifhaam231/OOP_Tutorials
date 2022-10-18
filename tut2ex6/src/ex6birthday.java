import java.util.ArrayList;
import java.util.Random;

public class ex6birthday {

    public static void main(String[] args) {

        ArrayList<Integer> birthNo = new ArrayList<Integer>();
        Random humNo = new Random();
        int temp = 0;

        boolean attempt = false;

        temp = humNo.nextInt(1, 365);
        birthNo.add(temp);
        temp = humNo.nextInt(1, 365);

            while (true) {
                for (int j = 0; j < birthNo.size(); j++) {
                    if (temp == birthNo.get(j)) {
                        attempt = true;
                        break;
                    } else {
                        System.out.println(birthNo);
                        birthNo.add(temp);
                        temp = humNo.nextInt(1, 365);
                    }
                }
                if (attempt==true) {
                    break;
                }
            }

        System.out.println("Final list " + birthNo);
        System.out.println("Number of people is " + birthNo.size());

    }
}
