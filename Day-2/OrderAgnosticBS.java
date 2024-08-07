public class OrderAgnosticBS {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int target = 12;
        int ans = oabs(arr,target)+1;

        System.out.println("Found at : "+ans);

    }

    static int oabs(int[] arr,int t)
    {
        int s=0;
        int e=arr.length-1;
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

