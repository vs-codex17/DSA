package Arrays.Problems_Leetcode;
import java.util.*;
public class Median_of_2_Sorted_Arrays {
    public static void Median(double Arr1[], double Arr2[]){
        double Arr3[]= new double[Arr1.length+Arr2.length];

        for(int i=0; i< Arr1.length; i++){
            Arr3[i]= Arr1[i];
        }
        for(int i=0; i< Arr2.length; i++){
            Arr3[Arr1.length+i]= Arr2[i];
        }

        Arrays.sort(Arr3);
        for(int i=0; i< Arr3.length; i++){
            System.out.print(Arr3[i]+" ");
        }
        System.out.println();
        if(Arr3.length%2==0){
            double median= Arr3[Arr3.length/2], median2=Arr3[(Arr3.length/2)-1];
            System.out.println("Median is :"+(median+median2)/2);
        }
        else{
            System.out.println("Median is : "+Arr3[Arr3.length/2]);
        }
    }

    public static void main(String[] args){
        double Arr1[]= {1,2};
        double Arr2[]= {3,4};

        Median(Arr1, Arr2);
    }
}
