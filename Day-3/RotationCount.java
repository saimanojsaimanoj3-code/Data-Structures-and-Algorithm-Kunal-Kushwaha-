public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println("Rotation Count : "+(findpiovt(arr)+1));

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
