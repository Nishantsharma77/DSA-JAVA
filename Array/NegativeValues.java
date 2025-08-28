package Array;

import java.util.Scanner;

public class NegativeValues {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements");

        // taking input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // printing only negative values
        System.out.println("Negative values are:");
        for (int i = 0; i < n; i++) 
            if (arr[i] < 0) {
                System.out.println(arr[i] + " ");
            }
        }
    }

