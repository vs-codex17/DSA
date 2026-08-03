package Arrays;

public class Reverse_array {
    public static void reverse(int reverse_A[]){
        int first= 0, last= reverse_A.length-1;

        while(first<last){
            int temp= reverse_A[last];
            reverse_A[last]= reverse_A[first];
            reverse_A[first]= temp;

            first ++;
            last --;

        }
    }

    public static void main(String[] args){
        int reverse_A[]= {2,4,35,21,1,10};

        reverse(reverse_A);
        for(int i=0; i<reverse_A.length; i++){
            System.out.print(reverse_A[i]+" ");
        }

    }
}
