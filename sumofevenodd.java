import java.util.*;
public class sumofevenodd {
    public static void main(String[] args) {
        /*Write a program that reads a set of integers, and then prints the sum of the
even and odd integers. */
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of N ");
        int n =sc.nextInt();
        int evencount=0;
        int oddcount=0;
        for(int i=0;i<n;i++){
            System.out.println("Enter the input");
            int input=sc.nextInt();
if (input%2==0) {
    evencount+=1;
}
else{
    oddcount+=1;
}
        }

        System.out.println("Even count  "+evencount+"      Oddcount  "+oddcount);
    }
}
