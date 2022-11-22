import java.util.*;
class Board {
    int ar[][];
    // creates a nxn size board
    public Board(int n) {
        ar = new int[n][n];
    // fill in array with random ints in the range [0, 100]
        Random generator = new Random();
        for (int i=0; i < n; i++)
            for (int j=0; j < n; j++)
                ar[i][j] = generator.nextInt(101);
    }
    // display the contents of the board
    public void print() {
        for (int[] r : ar) { // for all rows
            for (int c : r) // for every element in current row
                System.out.print(c + " ");
            System.out.println();
        }
    }

    void findMaxInDiagonal(){
        int p = ar[0][0];
        for (int[] r : ar) { // for all rows
            for (int c : r) // for every element in current row
                if (c > p) {
                    p = c;
                }
        }
        System.out.println(p);
    }

    void findMaxInRow(int row){
        int p = 0;
        for (int r : ar[row]) { // for all rows
            if (r > p) {
                p = r;
            }
        }
        System.out.println(p);
    }

    void findMaxInColumn(int column){
        int p = 0;
        for (int r = 0; r < ar.length; r++) { // for all rows
            for (int c = 0; c < ar.length; c++) // for every element in current row
                if (c==column) {
                    if (ar[r][c] > p) {
                        p = ar[r][c];
                    }
                }
        }
        System.out.println(p);
    }
}
