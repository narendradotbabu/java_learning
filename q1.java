import java.util.*;
public class q1 {
    public static void main(String[] args) {
        //Question 1 : In a program, input 3 numbers : A, B and C. You have to output the average othese 3 numbers.
//(Hint : Average of N numbers is sum of those numbers divided by N)
Scanner a= new Scanner(System.in);
Scanner b= new Scanner(System.in);
Scanner c= new Scanner(System.in);
System.out.println("Enter A value");
float A=a.nextFloat();
System.out.println("Enter B value");
float B=b.nextFloat();
System.out.println("Enter C value");
float C=c.nextFloat();
float sum=(A+B+C)/3;
System.out.println(sum);

    }
}
