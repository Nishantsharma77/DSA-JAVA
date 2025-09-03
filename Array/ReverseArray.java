//2 variable//2 variable approach
//arr= {6,8,6,2,4,9}
// to reverse this
//{9,4,2,1,8,6}

// we will use 2 variables==swapping method

// arr 0|1|2|3|4|5|
    //    6 8 1 2 4 9

    //    i          j(n-1)// i ko aage bdhayo j ko peeche jb tk mil na jaye
    //swap a,b
    // temp=a;
    // a=b;
    // b=temp;
    // 6 and 9 first swap
   

package Array;

public class ReverseArray{
    public static void main(String[] args) {
        int arr[]={3,19,56,9,83,69,78,54,27};
        int n=arr.length;
        int i=0, j=n-1;
        //if we have to just reverse given number just write
        // e.g i=2;5
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;  
        }
        for(int ele :arr){
           System.out.println(ele+ " ");
        }
    }
}
