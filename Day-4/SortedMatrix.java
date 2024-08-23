import java.util.*;
public class SortedMatrix {
    public static void main(String[] args) {
        int [][] arr = {
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,60}
        };
        System.out.println(Arrays.toString(search(arr,60)));
    }
    
    static int[] binsrch(int[][] arr ,int r, int cs, int ce,int t)
    {
        while(cs <=ce)
        {
            int mid =cs+(ce-cs)/2;

            if(arr[r][mid] == t)
            {
                return new int[]{r,mid};
            }

            if(arr[r][mid] > t)
            {
                ce = mid - 1;
            }
            else 
            {
                cs = mid + 1;
            }
        }
        return new int[]{-1,-1};
    }

    static int[] search(int[][] arr, int t)
    {
        int r = arr.length ;
        int c = arr[0].length;

        if(r==1){
            return binsrch(arr,0,0,c-1,t);
        }

        int rs = 0;
        int re = r-1;
        int cmid = c/2;

        while(rs<(re-1)){
            int mid = rs+(re-rs)/2;

            if(arr[mid][cmid] == t){
                return new int[]{mid,cmid};
            }
            if(arr[mid][cmid] < t){
                rs = mid;
            }
            else{
                re = mid;
            }
    }

    if(arr[rs][cmid]== t)
    {
        return new int[]{rs,cmid};
    }
    if(arr[rs+1][cmid]== t)
    {
        return new int[]{rs+1,cmid};
    }



    if(t<=arr[rs][cmid-1])
    {
        return binsrch(arr,rs,0,cmid-1,t);
    }
    if(t>=arr[rs][cmid+1])
    {
        return binsrch(arr,rs,cmid+1,c-1,t);
    }
    if(t<=arr[rs+1][cmid-1])
    {
        return binsrch(arr,rs+1,0,cmid-1,t);
    }
    else
    {
        return binsrch(arr,rs+1,cmid+1,c-1,t);        
    }
}
}
