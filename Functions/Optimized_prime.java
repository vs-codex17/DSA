package Functions;

import java.util.Scanner;
public class Optimized_prime {
    public static boolean Optimized_prime() {
        System.out.println("enter the no. : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==2){
            return true;
        }
        for (int i = 2; i <=Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args){
        System.out.print(Optimized_prime());
    }
}



