package Functions;
import java.util.Scanner;
public class Factorial {

    public static int factorial(int n){
        int num = 1;
        for(int i=1; i<=n; i++){
            num = num*i;
        }
        System.out.println("factorial of n is : "+num);
        return num;
    }
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        System.out.print("enter the value of n: ");
        int n= sc.nextInt();
        factorial(n);
    }
}
