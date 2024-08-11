public class FirstLastelement {
    public static void main(String[] args) {

        int[] n = { 233, 12, 23, 23, 23, 23, 23, 23, 89, 90, 101, 112, 123, 134, 145, 156, 167, 178, 189, 200 };
        int target=23;

        System.out.println("First Index : " + searchRange(n, target)[0] + "    Last Index : " + searchRange(n, target)[1]);
        
    }
    public static int[] searchRange(int[] arr,int target)
    {
        int[] ans = {-1,-1};
        ans[0] = search(arr,target,true);
        ans[1] = search(arr,target,false);
        return ans;
    }
    public static int search(int[]arr, int target,boolean findStartIndex)
    {
        int ans =-1;
        int s = 0;
        int e = arr.length - 1;

        while (s <= e)
        {
            int mid = s+(e - s) / 2;

            if (arr[mid] == target)
            {
                ans = mid;
                if(findStartIndex)
                {
                    e = mid - 1;
                }
                else
                {
                    s = mid + 1;
                }
            }
            else if (arr[mid] > target)
            {
                e = mid - 1;
            }
            else
            {
                s = mid + 1;
            }
        }
        return ans;
    }
}
