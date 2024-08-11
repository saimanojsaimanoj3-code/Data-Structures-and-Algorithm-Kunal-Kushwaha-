public class SearchMountainPeak {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 18, 16, 14, 12, 10, 8, 6, 4, 2};
        System.out.println("Found at : "+search(arr,18));   
    }
    static int search(int[] arr,int target)
    {
        int peak = peakIndexInMountainArray(arr);
        int ft=oabs(arr, target, 0,peak);
        if(ft!=-1)
        {
            return ft;
        }
        return oabs(arr, target, peak+1,arr.length-1);

    }
    static int peakIndexInMountainArray(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        while (s < e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] > arr[mid + 1]) {
                e = mid;
            } else {
                s = mid + 1;
            }
        }
        return s;
    }
    static int oabs(int[] arr,int t,int s,int e)
    {
        boolean isasc =arr[s]<arr[e];

        while(s<=e)
        {
            int mid = s+(e-s)/2;

            if(arr[mid]==t)
            {
                return mid;
            }

            if(isasc){
                if(t<arr[mid])
                {
                    e=mid-1;
                }
                else
                {
                    s=mid+1;
                }
            }
            else{
                if(t>arr[mid]){
                    e=mid-1;
                }
                else
                {
                    s=mid+1;
                }
            }
    }return -1;
}

}
