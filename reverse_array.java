public class reverse_array {
    public static void reverse(int my_array[]){
       int firstloc=0;
       int lastloc=my_array.length-1;
       while (firstloc<lastloc) {
        int temp=my_array[firstloc];
        my_array[firstloc] = my_array[lastloc];
        my_array[lastloc]=temp;
        firstloc+=1;
        lastloc-=1;

       }
    }
    public static void main(String[] args) {
        int my_array[]={2,3,4,8,1,6,10,7};
        reverse(my_array);

for(int i=0;i<=my_array.length-1;i++){
    System.out.print(my_array[i]+" ");
}
    }
}
