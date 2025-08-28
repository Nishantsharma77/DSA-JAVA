package Array;

public class SumofElements {
    public static void main(String args[]){
        int[]arr ={-6,8,14,17,65,-18,30};
        int sum = 0;
        int product =1;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            product*=arr[i];

        }
        System.out.println(sum);
        System.out.println(product);
    }
}
