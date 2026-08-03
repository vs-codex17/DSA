package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Binary_search {
    public static int Search(int array[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the no. : ");
        int key = sc.nextInt();

        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (array[mid] == key) {
                return mid;
            }
            if (array[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args){

        int array[]= {1,4,8,9,10,15,17};
        System.out.println("at index"+ Search(array));

    }
}
