public class methodoverloading {
    public static int adding(int a,int b){
        int sum=a+b;
        return sum;
    }



        public static int adding(int a,int b,int c){
        int sum=a+b+c;
        return sum;
    }
    public static void main(String[] args) {
System.out.println(adding(20,30,60));



    }
}
