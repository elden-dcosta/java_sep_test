public class NumberGrid {
    public static void main(String[] args) {

        final int MAX_ROWS = 5;
        final int MAX_COLS = 5;
        final int TWO_DIGITS = 10; // smallest two digit number, used for formatting

        int toPrintNum;

        for (int i = 1 ; i <= MAX_ROWS; i++){
            for (int j = 1; j <= MAX_COLS; j++)
            {
                toPrintNum = i * j;
                if (toPrintNum < TWO_DIGITS) System.out.print(" ");
                System.out.print(" " + toPrintNum);
            }
            System.out.println();
        }
    }
}
