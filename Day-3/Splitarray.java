public class Splitarray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println("largest sum among the two subarrays is : "+splitArray(arr,target));
    }
    public static int splitArray(int[] nums,int m)
    {
        int s=0;
        int e=0;
        for(int i=0;i<nums.length;i++)
        {
            s = Math.max(s,nums[i]);
            e += nums[i];
        }
        while(s<e)
        {
            int mid = s + (e-s)/2;
            int sum=0;
            int p=1;
            for(int num:nums)
            {
                if(sum+num>m)
                {
                    sum=num;
                    p++;
                }
                else
                {
                    sum+=num;
                }
                
            }
            if(p>m)
            {
                s=mid+1;
            }
            else{
                e=mid;
            }
        }
        return e;

    }
}
