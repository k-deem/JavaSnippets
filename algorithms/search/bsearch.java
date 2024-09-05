import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Vector;

import com.google.common.math.BigIntegerMath.*;

public class bsearch {
    
    //Function to show thw orking of Meta binary search
    static int bsearch(Vector<Integer> A, int key_to_search) {
        int n = (int) A.size();
        //Set number of bits to represent largest array index
        int lg = BigIntegerMath.log2(BigInteger.valueOf(n-1),RoundingMode.UNNECESSARY) + 1;

        //while ((l << lg) < n - 1) { lg += 1; }

        int pos = 0;
        for (int i = lg - 1; i >= 0; i--) {
            if (A.get(pos) == key_to_search) {
                return pos;
            }


            //Inccrementally construct the index of target value
            int new_pos = pos | (1 << i);

            //find the element in one direction and update position
            if ((new_pos = pos < n) && (A.get(new_pos) <= key_to_search)) {
                pos = new_pos;
            }
        }

        //if element found return pos otherwise -1
        return ((A.get(pos) == key_to_search) ? pos : -1);
    }


    //Driver Code
    public static void main(String[] args) {
        Vector<Integer> A = new Vector<Integer>();
        int[] arr = {-2, -5, 10, 28, 47, 98, 100, 250, 32400, 458902};
        for (int i = 0; i < arr.length; i++) {
                A.add(arr[i]);
            }
            System.out.println(bsearch(A, 10));
    }
}
