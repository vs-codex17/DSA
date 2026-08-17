package Bit_Manipulation;

public class Binary_Shifts_1sCompliment {
    public static void main(String[] args){
        // 1's Compliment
        System.out.println(~5);

        // Left Shift          formula: a<<b = a * 2^b

        // in left shift representation 5<<2 means 5 shifts 2 on the left :
        // if 5 in binary is 00000101  so it changes and make 00010100 ...... last empty space takes 0
        System.out.println(5<<2);

        // Right shift        formula: a>>b = a/ 2^b
        System.out.println(6>>1);
    }
}
