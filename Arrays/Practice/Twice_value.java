package Arrays.Practice;

public class Twice_value {
    public static boolean Twice(int Array[]){
        for(int i=0; i< Array.length-1; i++){
            for(int j=i+1; j< Array.length; j++){
                if(Array[i]==Array[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        int Array[]= {1,2,4,5,1,6};

        System.out.println(Twice(Array));
    }
}
