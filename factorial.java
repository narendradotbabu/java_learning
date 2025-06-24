import java.util.*;
public class factorial {
//Write a program to find the factorialof any number entered by the user.
/*(Hint : factorial of a number n = n * (n-1) * (n-2) * (n-3) * …… * 1 and exists for positive numbers
only. We write factorial as n!
So, factorial of 0! = 1, 1! = 1, 2! = 2, 3! = 6, 4! = 24 and so on.
Note - Please do not confuse factorial with NOT EQUAL TO operator, they are not the same)*/
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the n Number for Factorial");
int n=sc.nextInt();

for(long i=1;i<=n;i++){
    long sum=1;
    for(long j=1;j<=i;j++){
        sum=sum*j;
    }
    System.out.println(sum);
}
    }
}