public class binarysearch {

    public static void b_searching(int numbers[],int key){
int start=0;
int end=numbers.length-1;
while (start<=end) {
    int mid=(start+end)/2;
    if (key==numbers[mid]) {
        System.out.println("keyfound at "+mid);
        break;
    }
    else if (key<numbers[mid]) {
        end=mid-1;
    }
    else{
        start=mid+1;
    }
}

    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,6};
        int key=4;
        b_searching(numbers, key);
    }
}