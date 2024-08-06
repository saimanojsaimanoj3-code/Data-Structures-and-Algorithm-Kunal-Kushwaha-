//Linear Search
public class LinearSearch
{
    public static void main(String[] args) {
        int[] n = {5, 12, 23, 34, 45, 56, 67, 78, 89, 90, 101, 112, 123, 134, 145, 156, 167, 178, 189, 200};
        int t=44;
        int a=linSrch(n, t);
        if(a>0)
            System.out.println("The Target value is found at :"+linSrch(n,t)+1);
        else
            System.out.println("The Target value is not found");
    }
    static int linSrch(int[] arr, int t)
    {
        if(arr.length == 0){
            return -1;
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == t){
                return i;
            }
        }

        return -1;
    }

}