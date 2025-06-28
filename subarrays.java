public class subarrays {
    public static void subarrays(int array[]){
        int tb=0;
        for(int i=0;i<array.length;i++){
            for(int k=i;k<array.length;k++){
                for(int j=i;j<k+1;j++){
System.out.print(array[j]+" ");
            }System.out.println();tb++;
            }
        }System.out.println("Total Sub arrays: "+tb);
    }
    public static void main(String[] args) {
        int array[]={2,3,4,5,6,7};
        subarrays(array);
    }
}
