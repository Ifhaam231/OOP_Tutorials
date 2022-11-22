import java.util.ArrayList;

public class ContainerTest extends Book {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add(3.4);
        //list.add(new Integer(4));

        Book myBook = new Book();
        list.add(myBook);

        double d;
        d = (double) list.get(0); // Problematic line
        Double d2 = (Double) list.get(1); // Problematic line
        Book b3 = (Book) list.get(1); // Problematic line
        Book b2 = (Book) list.get(2); // Problematic line
    }
}