package Arrays;

public class Largest_no {
    public static void Largest_no(){

        int num[]={5,15,7,26};

        int l= 0;          // l=integer.min_value  is = -infinity
        for(int i= 0; i< num.length; i++){
            if(l<num[i]){
                l=num[i];
            }
        }
        System.out.println("largest no. is "+ l);
    }




    public static void main(String[] args){
        Largest_no();
    }
}
