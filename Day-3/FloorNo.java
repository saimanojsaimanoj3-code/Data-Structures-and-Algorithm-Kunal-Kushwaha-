public class FloorNo {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29};
        int target = 0;
        System.out.println("Flooring index  : "+(floor(arr, target)));
        
    }
        static int floor(int[] arr, int target)
    {
        
        int s = 0;
        int e = arr.length - 1;

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
        return e;
    }

    
}
