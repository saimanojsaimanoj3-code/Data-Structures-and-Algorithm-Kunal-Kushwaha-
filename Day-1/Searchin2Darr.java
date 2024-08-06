
import java.util.Arrays;

public class Searchin2Darr {
    
    public static void main(String[] args) {

        int[][] arr = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}
        };
        int t=17;
        int[] a=lnrsrcht(arr, t);
        if(a[0]<-1)
            System.out.println("Target not found");
        else
            System.out.println("Target found at : "+Arrays.toString(a));//Should convert the returned array to String to display

    }
    static int[] lnrsrcht(int[][] arr,int t){

        if(arr.length == 0){
            return new int[]{-1,-1};
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(arr[i][j] == t){
                    return new int[]{i,j};
                }
            }
        }

        return new int[]{-1,-1};
 
    }

}
