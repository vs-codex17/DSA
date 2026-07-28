package Arrays;
import java.util.Scanner;
public class Basic_Operations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // input operations
        int marks[] = new int[50];

        System.out.print("Enter the marks of Maths : ");
        marks[0] = sc.nextInt();

        System.out.print("Enter the marks of Chemistry : ");
        marks[1] = sc.nextInt();

        System.out.print("Enter the marks of Physics : ");
        marks[2] = sc.nextInt();

        System.out.println("phy : "+ marks[2] + " "+ "chem :"+ marks[1] + " "+ "maths :"+ marks[0]);

        //Update operations
        marks[0] = 79;

        System.out.println("phy : "+ marks[2] + " "+ "chem :"+ marks[1] + " "+ "maths :"+ marks[0]);

        // length of an array
        System.out.println("length of an array :"+" "+marks.length);
    }
}
