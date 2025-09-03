package Array;
//input output

import java.util.*;

public class arraybasics{
    public static void main(String args[]){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        // int[] arr = {5,3,4,7,8,5,4};
        // //to print length
        // // System.out.println(arr.length);
        // int n=arr.length; //index 0 to n-1
        // for(int i =0;i<n-1;i++){
        //     System.out.print(arr[i]+ " ");
        // }

        
        int [] karan = new int[7];
        //default
        // for(int i =0;i<7;i++){
        //     System.out.print(karan[i]);
        // }

        //input lena hai
        for(int i =0;i<7;i++){
             karan[i] =sc.nextInt();
        }
        //print
         for(int i =0;i<7;i++){
            System.out.print(karan[i]);
        }

            
        }
}