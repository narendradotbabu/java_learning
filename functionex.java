import java.util.*;

public class functionex {
    //The Program Of function that takes two inputs and adds it and returns a sum.
    public static int addition(int a,int b){
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter First number");
    int a=sc.nextInt();
    System.out.println("Enter Second number");
    int b=sc.nextInt();
    
       System.out.println(addition(a,b));
    
    }
}
