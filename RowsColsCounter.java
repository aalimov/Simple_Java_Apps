public class RowsColsCounter {
    public static void main (String [] args) {
        int numRows = 2;
        int numCols = 3;

        int i;
        int k;
        char letter = 'A';

        for(i = 1; i <= numRows; ++i){
            for(k = 0; k < numCols; ++k){
                letter += k;
                System.out.print("" + i + letter + " ");
                letter = 'A';
            }
        }

        System.out.println("");

        return;
    }
}