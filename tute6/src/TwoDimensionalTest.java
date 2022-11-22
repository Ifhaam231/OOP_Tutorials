public class TwoDimensionalTest {
    public static void main(String[] args) {
        Board board1 = new Board(5);
        board1.print();

        System.out.print("\nMaximum diagonal - ");
        board1.findMaxInDiagonal();

        System.out.print("\nMaximum in row number 2 - ");
        board1.findMaxInRow(1);

        System.out.print("\nMaximum in column number 2 - ");
        board1.findMaxInColumn(1);
    }
}
