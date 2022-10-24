import java.awt.*;

public class Ex3 {

    public Ex3() {

        //Ex3.1
        Rectangle r1 = new Rectangle(0, 0, 100, 50);
        Rectangle r2 = new Rectangle(r1);
        r2.grow(10,20);

        System.out.println(r1);
        System.out.println(r2);

        //Ex3.2
        Rectangle r3 = new Rectangle(0, 0, 100, 50);
        Rectangle r4 = r3;
        r4.grow(10,20);

        System.out.println(r3);
        System.out.println(r4);

        //Ex3.3
        double n1 = 150;
        double n2 = n1;
        n2 = n2 * 20; // grow n2
        System.out.println(n1);
        System.out.println(n2);
    }
}
