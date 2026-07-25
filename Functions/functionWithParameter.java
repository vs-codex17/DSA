package Functions;
import java.util.Scanner;
public class functionWithParameter {

    public static int add(int A,int B){
        int sum = A+B;
        return sum;
    }
    public static String addname(String a, String b){
        String add = a+b;
        return add;
    }
    public static void main(String[] args){
        System.out.println(add(3,4));
        Scanner sc = new Scanner (System.in);

        System.out.print("enter your first name : ");
        String a = sc.nextLine();

        System.out.print("enter your second name : ");
        String b = sc.nextLine();

        System.out.print(addname(a,b));
    }
}
