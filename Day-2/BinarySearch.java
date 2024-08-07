public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29};
        int target = 13;
        System.out.println("Found at : "+(binarySearch(arr, target)+1));
        
    }

    static int binarySearch(int[] arr, int target)
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
        return -1;
    }
    
    
}