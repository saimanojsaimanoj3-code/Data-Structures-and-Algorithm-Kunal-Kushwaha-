public class FirstLastelement_Infinite {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29};
        int target = 13;
        System.out.println("Found at : "+searchRange(arr,target));
    }
    public static int searchRange(int[] arr,int target)
    {
        int start = 0;
        int end = 1;
        while(target>arr[end])
        {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return search(arr,target,start,end);
    }
    public static int search(int[]arr, int target, int s, int e)
    {
        while (s <= e)
        {
            int mid = s+(e - s) / 2;

            if (arr[mid] == target)
            {
                return mid;
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
        return -1;
    }
}
