public class maximum_subarrays_sum {

    public static void max_sum_array(int array[]){
        int max=0;
        
     for(int i=0;i<array.length;i++){
        int total;
     for(int j=0;j<array.length;j++){
         total=0;
        for(int k=i;k<j+1;k++){
     total=total+array[k];
        }
        if (max<total) {
            max=total;
        }
     }
     }
     System.out.println("Maxium Sum "+max);
    }
    public static void main(String[] args) {
        int array[]={2,4,6,8,10};
        max_sum_array(array);
    }
}