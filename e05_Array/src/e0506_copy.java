import static java.lang.System.out;
import static java.lang.System.arraycopy;

//import static java.lang.System.*;

import java.util.Arrays;


public class e0506_copy {
    public static void main(String args[]) {
        int[] arr = {0,1,2,3,4,5,6,7};

        //////// copyOf
        int[] newArr1 = Arrays.copyOf(arr, 6);
        for (int i = 0; i < newArr1.length; i++) {
            System.out.print(newArr1[i] + "\t");
        }
        System.out.println();

        //////// copyOfRange
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        int[] newArr2 = Arrays.copyOfRange(arr, 1, 3);  // 复制[from:to), 复制[from:to-1]
        for (int i = 0; i < newArr2.length; i++) {
            System.out.print(newArr2[i] + "\t");
        }
        System.out.println();

        //////// System.arraycopy(src, srcPos, dest, destPos, length);
        int[] newArr3 = new int[10];
        //System.arraycopy(arr, 2, newArr3, 3, 5);
        arraycopy(arr, 2, newArr3, 3, 5);
        for (var item: newArr3) {
            System.out.print(item + "\t");
        }
        out.println();
    }
}
