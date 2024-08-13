public class RBS {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target=0;
        System.out.println("Pivot Index : "+findpiovt(arr));
        System.out.println("Target found at : "+search(arr,target));

    }
    public static int search(int[] nums, int target) {
        int pivot = findpiovt(nums);
        if(pivot == -1)
        {
            return binarySearch(nums, target, 0, nums.length-1);
        }
        
        if(nums[pivot] == target)
        {
            return pivot;
        }

        if(target >= nums[0])
        {
            return binarySearch(nums, target, 0, pivot-1);
        }
        return binarySearch(nums, target, pivot+1, nums.length-1);

    }

    static int binarySearch(int[] arr, int target,int s,int e)
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

    static int findpiovt(int[] arr)
    {
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (mid<e && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid>s && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            if(arr[mid] <=arr[s])
            {
                e = mid -1;
            }
            else{
                s = mid + 1;
            }
        }
        return -1;
    }
}
