//arr = {4,10,10,10,6,3,8}
// max=10
// Smax=8

// Approach= Find largest element(max)
// now find largest element except Max

package Array;

public class SecondMax {
    
    public static void main(String[] args) {
        int[]arr={4,10,8,6,3,8};
        int max= Integer.MIN_VALUE;
        int SecondMax= Integer.MIN_VALUE;
        //CALCULATE MAX
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];

        }
            //calculate second max
            for(int i=0;i<arr.length;i++){
            if(arr[i]>SecondMax && arr[i]!= max) SecondMax=arr[i];
            }
            System.out.println(max);
            System.err.println(SecondMax);
        }
    }

