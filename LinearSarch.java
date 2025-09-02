public class LinearSarch {
    public static void main(String args[]){
        int[]arr = {12,7,9,18,68,17,9};
        int target = 68;
        boolean found = false; //false means target array mein nhi hai
        for(int i=0;i<arr.length;i++){
            if(arr[i]== target){
                System.out.println("Target exists at index" +i);
                found = true; //target array mein hai
                break;
            }
        }
        if(found==false)System.out.println("Target Not found");
        
    }
}
