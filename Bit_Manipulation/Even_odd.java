package Bit_Manipulation;

public class Even_odd {
    public static void EvenORodd(int n){
        int BitMask = 1;
        if((n&BitMask)==0){
            System.out.println("no. is Even");
        }
        else{
            System.out.println("no. is Odd");
        }
    }
    public static void main(String[] args){
        EvenORodd(3);
        EvenORodd(6);
    }
}
