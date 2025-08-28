package Array;

public class passingArrayToMethods {
    public static void main(String[] args) {
        int x[] = {10,3,6,8,10};
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);
    }
    public static void change(int[] x) {
        x[2]=29;
    }
}
