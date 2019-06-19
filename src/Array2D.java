
public class Array2D {
    public static void main(String[] args){


        String[][] twoD_arr= new String[10][5];
        for(int i=0 ; i<10; i++){
            for (int j=0; j<5; j++){
                twoD_arr[i][j] = "[row " + i + " col " + j + "] ";
                System.out.print(twoD_arr[i][j]);
            }
            System.out.println();

        }


//      Prints out multiplication table

        int[][] multTable = new int[12][12];
        for (int i = 0; i <multTable[0].length; i++){
            for(int j = 0; j<multTable[1].length; j++){
                multTable[i][j] = (i+1)*(j+1);
                System.out.print(multTable[i][j]);
                System.out.print('\t');
            }
            System.out.println();
        }


    }
}
