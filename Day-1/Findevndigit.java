public class Findevndigit{
    public static void main(String[] args) {
        int[] n = {233, 12, 23, 34, 45, 56, 67, 78, 89, 90, 101, 112, 123, 134, 145, 156, 167, 178, 189, 200};
        System.out.println("Number of Even digits : "+findnumbers(n));
        
    }

    static int findnumbers(int[] nums){
        int count=0;
        for(int num:nums)
        {
            if(even(num)){
                count++;
            }
                
        }
        return count;
    }
        
    static int digit(int n){
        int count=0;
        while(n!=0){
            n=n/10;
            count++;
        }
        return count;
    }
    
    static boolean even(int n){
        int no = digit(n);
        return no%2==0;
    }
}
