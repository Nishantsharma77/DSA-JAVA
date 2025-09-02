package Array;

 //multiply odd indexed by 2 and in even add 10
public class ArrayPractice {
    public static void main(String[] args) {
       int[]arr={3,4,7,9,4,7,9};
       print(arr); 
       for(int i=0;i<arr.length;i++){
        if(i%2==1) arr[i] *=2;
       }
       print(arr);
    }
    public static void print(int [] arr){
        for(int i=0;i<arr.length;i++){
          System.out.print(arr[i]);
        }
       System.out.println();
    }
    
}
