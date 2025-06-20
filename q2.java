import java.util.*;
public class q2 {
    public static void main(String[] args) {
        //Question 2: In a program, input the side of a square. You have to output the area of the square.
//(Hint : area of a square is (side x side))


Scanner sc=new Scanner(System.in);
System.out.println("Enter Side of Square");
int sqr=sc.nextInt();
int area=sqr*sqr;
System.out.println("Area of a Square "+area);
    }
}
