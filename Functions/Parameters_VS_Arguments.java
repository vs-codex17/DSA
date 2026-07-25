package Functions;


public class Parameters_VS_Arguments {
    public static int addition (int a, int b){          //Parameters
        int sum = a+b;
        System.out.println(sum);
        return 0;
    }
    public static void main(String []args){
     addition(5,6);                              //Arguments
    }
}
