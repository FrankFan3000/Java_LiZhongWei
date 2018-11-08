public class e0502_Array2 {
    public static void main(String args[]){
        int[][] a = new int[][]{
                {12, 54, 34, 67},
                {22, 54, 34},
                {32, 54, 34, 67, 78},
        };

        for (int i=0; i<a.length; i++){
            for (int j=0; j<a[i].length; j++){
                System.out.print(a[i][j] + ", ");
            }
            System.out.println();
        }
    }



}
