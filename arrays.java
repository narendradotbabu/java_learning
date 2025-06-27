import java.util.*;
public class arrays {
    public static void main(String[] args) {
        int marks[]=new int[5];
    for(int i=0;i<=4;i++){
        System.out.println("Enter  "+i+" Student marks: ");
        Scanner sc=new Scanner(System.in);
        marks[i]=sc.nextInt();
    }


    System.out.println(marks[2]);
    }
}
