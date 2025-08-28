package Array;

public class MaxElement {
    public static void main(String args[]) {
        int[] arr = {-6, 7, 4, 2, 9, 12, 17, 4};
        // int max = arr[0];
        //or
        // int max=Integer.MIN_VALUE;
        int min =Integer.MAX_VALUE;

        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] > max)  max = arr[i];
        // }

        // for min
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)  min = arr[i];
         }

       System.out.println(min);
    }
}


