package Arrays;

public class Subarray_sum {
    public static void subarray(int numbers[]){

        int sum=0;
        int maxsum= Integer.MIN_VALUE;

        for(int i=0; i< numbers.length; i++){
            int start= i;

            for(int j=0; j< numbers.length; j++){
                int end= j;
                 sum=0;
                for(int k=start; k<=end; k++){

                    sum+=numbers[k];           //this is for sum of subarray

                    if(maxsum<sum){
                        maxsum=sum;
                    }
                }
                System.out.print(sum);
                System.out.println();
            }
        }
        System.out.print("max sum="+maxsum);
    }


    public static void kadanes_algo(int numbers[]){

        int cs= 0;
        int ms= Integer.MIN_VALUE;

        for(int i=0; i< numbers.length; i++){
            cs+=numbers[i];

            if(cs<0){
                cs=0;
            }
            ms= Math.max(cs,ms);
        }
        System.out.println("max sum ="+ ms);
    }


    public static void main(String[] args){
        int numbers[]={2,-4,8,-10,12,16};

//        subarray(numbers);

        kadanes_algo(numbers);
    }
}
