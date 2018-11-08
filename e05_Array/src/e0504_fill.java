import java.util.Arrays;

public class e0504_fill {
    public static void main(String args[]){
        int[] arr = new int[8];
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        //////// fill
        Arrays.fill(arr, 1);                            // 全部填满 val
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        Arrays.fill(arr, 1,4,7);    // 填充[from:to), // 填充[from:to-1]
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();


        //////// sort
        Arrays.sort(arr);                                   // 由小到大排序
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

    }
}
