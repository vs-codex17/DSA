package Functions;
import java.util.Scanner;
public class Binomial_coeffiecient {
    public static int factorial_n(int n){
        int sum =1;
        for(int i=1; i<=n;i++){
            sum = sum*i;
        }
        return sum;
    }

    public static int factorial_r(int r){
        int sum =1;
        for(int i=1; i<=r;i++){
            sum = sum*i;
        }
        return sum;
    }

    public static int factorial_nMr(int n,int r){
        int sum =1;
        for(int i=1; i<=(n-r);i++){
            sum = sum*i;
        }
        return sum;
    }

    public static void main(String []args){
        Scanner sc = new Scanner (System.in);

        double Binomial_coeff = (factorial_n(5))/factorial_r(3)*factorial_nMr(5, 3);

        System.out.println(Binomial_coeff);
    }
}
