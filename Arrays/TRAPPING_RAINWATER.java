package Arrays;

public class TRAPPING_RAINWATER {
    public static void rainwater(int height[]){

        int i;
        int j;
        // find leftmax = auxilary array which is also called by helper array

        int leftmax[] = new int[height.length];
        leftmax[0]= height[0];

        for( i=1; i< height.length; i++) {
           leftmax[i]= Math.max(height[i],leftmax[i-1] );
        }

        // find rightmax = auxilary array which is also called by helper array

        int rightmax[] = new int[height.length];
        rightmax[height.length-1]= height[height.length-1];

        for( j= height.length-2; j>=0; j--) {
            rightmax[j]= Math.max(height[j],rightmax[j+1] );
        }

        // print using loop        trapped water= (water level - bar level) * width

        int Total_Water= 0;

        for(int k=0; k< height.length; k++) {
            int water_level= Math.min(leftmax[k], rightmax[k]);
            int trapped_water = (water_level - height[k]);
            System.out.println("Trapped Water at index "+ k+" =" + trapped_water);

            Total_Water+=trapped_water;
        }

        System.out.println("");
        System.out.println("Total Water = "+Total_Water);


    }


    public static void main(String[] args){
        int height[]= {4,2,0,6,3,2,5};

        rainwater(height);
    }
}
