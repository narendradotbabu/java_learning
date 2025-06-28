import java.util.*;
public class largest_array {
    public static int largest(int number[]){
        int large=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            if (large<number[i]) {
                large=number[i];
                
            }

        }
        return large;
    }
    public static void main(String[] args) {
    int numbers[]={54,5,4,6,8,9,22,60};
System.out.println(largest(numbers));
    }
}
