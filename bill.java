import java.util.*;
public class bill {

    public static void main(String[] args) {
        /*Question 3: Enter cost of 3 items from the user (using float data type) - a pencil, a pen andan eraser. You have to output the total cost of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem) */

Scanner sc=new Scanner(System.in);
System.out.println("Enter Pencil cost");
float pencil=sc.nextFloat();
System.out.println("Enter Pen cost");
float pen =sc.nextFloat();
System.out.println("Enter Eraser cost");
float eraser=sc.nextFloat();
float sum=pencil+pen+eraser;
float gst=sum*0.18f;
float fp=sum+gst;
System.out.println();
System.out.println();
System.out.println("******** Bill ********");
System.out.println("1. Pencil: "+pencil);
System.out.println("2. Pen:    "+pen);
System.out.println("3. Eraser: "+eraser);
System.out.println();
System.out.println("Total: "+sum);
System.out.println("GST: 18%");
System.out.println("-------------------");
System.out.println("Final: "+fp);
    }
}