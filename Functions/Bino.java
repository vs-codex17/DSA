package Functions;

import java.util.Scanner;
public class Bino {
    public static int N(int n){
        int sum =1;
        for(int i=1; i<=n; i++){
            sum = sum*i;
        }
        return sum;
    }

    public static int R(int r){
        int sum =1;
        for(int i=1; i<=r; i++){
            sum = sum*i;
        }
        return sum;
    }

    public static int NmR(int n, int r){
        int sum =1;
        for(int i=1; i<=n-r; i++){
            sum = sum*i;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the value of n: ");
        int n= sc.nextInt();

        System.out.print("enter the value of r: ");
        int r= sc.nextInt();

        int ans= N(n)/(R(r)*NmR(n,r));
        System.out.print("Binomial Coefficient = "+ans);

        sc.close();
    }
}
