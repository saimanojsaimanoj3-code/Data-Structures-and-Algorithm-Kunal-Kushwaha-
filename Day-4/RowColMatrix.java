
import java.util.*;
public class RowColMatrix {
    public static void main(String[] args) 
    {
        int[][] arr = {
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };
        System.out.println("Target Index in 2D array : "+Arrays.toString(search(arr, 29)));
    }

    static int[] search(int[][] arr, int t)
    {
        int r = 0;
        int c = arr[0].length - 1;  

        while(r < arr.length && c >= 0)
        {
            if(arr[r][c] == t)
            {
                return new int[]{r,c};
            }
            else if(arr[r][c] > t)
            {
                c--;
            }
            else
            {
                r++;
            }
        }
        return new int[]{-1,-1};
    }
}
