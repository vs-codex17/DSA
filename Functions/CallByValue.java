package Functions;

public class CallByValue {
    public static int swapping(int a, int b){
        int temp = a;
        a = b;
        b = temp;                                       // swapping
        double divide = a/b;
        System.out.println(divide);
        return 0;
    }
    public static void main(String []args){
        swapping(4,8);
    }
}
