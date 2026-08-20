package Bit_Manipulation;

public class Fast_Expo {
    public static int fast_expo(int n, int i){
        int ans=1;

        while(i>0){
            if((i & 1)!=0){
                ans= ans*n;
            }
            n=n*n;
            i=i>>1;
        }
        return ans;
    }

    public static void main(String[] args){
        System.out.println(fast_expo(5,3));
    }
}
