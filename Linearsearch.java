import java.util.*;
public class Linearsearch {
    public static void main(String[] args) {
        int elements[]=new int[50];

        while (true) {
            
            Scanner sc= new Scanner(System.in);
            System.out.println("Menu  1.Add to Array 2. search Element in Array 3.Exit ");
int n=sc.nextInt();
 
            if (n==1) {
                
                System.out.println("Enter the number of Elements");
              int ch=  sc.nextInt();
              for(int i=0;i<ch;i++){
                System.out.println("Enter "+i+"Element ");
                elements[i]=sc.nextInt();
              }
            }
            else if (n==2) {
                System.out.println("Enter Element to search ");
                int el=sc.nextInt();
                System.out.println(elements[el]);
            }
            else if (n==3) {
                break;
            }
            else{
                System.out.println("Choose Correct answer");
            }
        }
        
        
    }
}
