package Bit_Manipulation;

public class ith_Bit {
    public static int get_Ith_bit(int n, int i){
        int BitMask = 1<<i;
        if((n & BitMask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }

    public static int set_Ith_Bit(int n, int i){
        int Bitmask = 1<<i;
        return n | Bitmask;
    }

    public static int clear_Ith_bit(int n, int i){
        int Bitmask = ~(1<<i);
        return n&Bitmask;
    }

    public static int update_Ith_bit(int n, int i, int newbit){
//        if(newbit==0){
//            return clear_Ith_bit(n,i);
//        }
//        else{
//            return set_Ith_Bit(n,i);
//        }

        n=clear_Ith_bit(n,i);
        int Bitmask = newbit<<i;
        return n|Bitmask;
    }

    public static void main(String[] args){
        System.out.println(get_Ith_bit(5,2));
        System.out.println(set_Ith_Bit(10,2));
        System.out.println(clear_Ith_bit(10,1));
        System.out.println(update_Ith_bit(10,2,1));
    }
}
