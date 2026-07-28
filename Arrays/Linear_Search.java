package Arrays;
import java.util.Scanner;
public class Linear_Search {
    public static void main(String[] args){
        int marks[]= {10,15,26,23,14,1,45,48,50,100};

        for(int i=0; i< marks.length; i++){
            if(marks[i]==1){
                System.out.println(i);
                System.out.println("no. found at index "+ i);
            }
        }

    }
}
