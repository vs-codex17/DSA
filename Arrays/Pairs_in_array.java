package Arrays;

public class Pairs_in_array {
    public static void Pairs(int Array[]){
        for(int i=0; i<Array.length; i++){
            int curr= Array[i];

            for(int j=i+1; j< Array.length; j++){
                System.out.print("("+ curr+","+Array[j]+")");
            }
            System.out.println();
        }
    }




    public static void main(String[] args){
        int Array[]= {2,4,8,10,12};

        Pairs(Array);
    }
}
