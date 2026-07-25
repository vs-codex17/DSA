package Functions;

import java.util.Scanner;
public class PrimeNumber {
    public static boolean prime(){
        System.out.println("enter the no. :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==2){
            return true;
        }
        for (int i=2;i<n;i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args){
        System.out.print(prime());
    }
}

