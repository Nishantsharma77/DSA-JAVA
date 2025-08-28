package Array;
import java.util.Arrays;

public class ShallowCopyDeepCopy {
    public static void main(String[] args) {
        int a=4; //4 bytes leta hai 
       int[]  arr={10,20,30,40};
       int[]x =arr; //x is shallow copy of arr //actual mein copy nahi bnaya
       x[0]=100;
       int[] deep = Arrays.copyOf(arr, arr.length); //deep copy //we make brand new copy of array
       deep[0]=100;
       System.out.println(arr[0]);
    }
}
