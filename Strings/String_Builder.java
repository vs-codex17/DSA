package Strings;

public class String_Builder {
    public static void main(String[] args){
        StringBuilder sb= new StringBuilder("");

        for(char i='a'; i<='z'; i++){
            sb.append(i);
        }
        System.out.println(sb);
        System.out.println(sb.length());
        // time complexity == O(n) which is equal to O(26)
    }
}
