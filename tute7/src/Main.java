import java.util.*;

public class Main {
    public static ArrayList<Integer> loadArray(int[] list) {
        for (int i = 1; i < list.length; i++) {
            list[i] = list[i] + list[i - 1];
        }
        System.out.println(Arrays.toString(list));
        return new ArrayList(Collections.singleton(list));
    }

    public static void listDemo(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int element = list.get(i);
            list.remove(i);
            list.add(0, element + 1);
        }
        System.out.println(list);
    }

    public static void main(String[] args) {/*
        //Ex1
        loadArray(new int[]{7});
        loadArray(new int[]{3, 6});
        loadArray(new int[]{4, 6, 8});
        loadArray(new int[]{1, 2, 3, 4});
        loadArray(new int[]{8, 4, 2, 0, 4});

        //Ex2
        listDemo(Objects.requireNonNull(loadArray(new int[]{5, 10, 15})));
        listDemo(Objects.requireNonNull(loadArray(new int[]{8, 2, 8, 7,4})));
        listDemo(Objects.requireNonNull(loadArray(new int[]{-1, 3, 28, 17, 9, 30})));
        //issues check

        //Ex3-Book class
        Book harry = new Book("Potter", 45,1919,"Manamune");
        System.out.println(harry.getTitle());
        System.out.println(harry.toString());

        //Ex5
        //Collections.sort();


        //Ex6
        HashMap<Book, Integer> hmap = new HashMap<Book, Integer>();
        // insert the key for each book
        for (int i=0; i<bookList.size(); i++){
            System.out.printl ("Please, enter the number of the shelf where is placed the book" + bookList.get(i).getTitle());
            int numShelf = s.nextInt();
            //Adding elements to HashMap
            hmap.put(bookList.get(i), numShelf);
        }
*/
    }
}
