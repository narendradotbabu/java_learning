import java.util.*;
public class feverchk {
    public static void main(String[] args) {
        /*Finish the following code so that it prints You have a fever if your temperature
is above 100 and otherwise prints You don't have a fever.
 */

 Scanner sc= new Scanner(System.in);
 System.out.println("Enter your Temparature");
 double temp=sc.nextDouble();
if (temp>100) {
    System.out.println("You have fever");
}
else{
System.out.println("You dont have fever");
}


    }
}
