package Functions;

public class PrimeInRange {
    public static boolean prime(int n){
        if(n==2){
            return true;
        }
        for (int i=2;i<n;i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void priinrange(int n){
        for(int i =0; i<=n; i++){
            if (prime(i)==true){
                System.out.println(i);
            }
        }
    }

    public static void main(String[]args){
        priinrange(10);
    }
}
