package Strings;
import java.util.*;
public class Shortest_path {
    public static double Short_path(String path){
        int x=0, y=0;
        int x1=0, y1=0;
        for(int i=0; i<path.length(); i++){
            char dir = path.charAt(i);
            if(dir=='W'){
                x1=x1-1;
            }
            else if(dir=='N'){
                y1=y1+1;
            }
            else if(dir=='E'){
                x1=x1+1;
            }
            else {
                y1=y1-1;
            }
        }
        double ans= Math.sqrt(((x1-x)*(x1-x))+(y1-y)*(y1-y));
        return ans;
    }

    public static void main(String[] args){
        String path = "WNEENESENNN";
        System.out.println(Short_path(path));
    }
}
