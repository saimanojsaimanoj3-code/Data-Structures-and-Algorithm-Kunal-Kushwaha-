public class FindMin {
    
    public static void main(String[] args) {
        
        int[] n = {233, 12, 23, 34, 45, 56, 67, 78, 89, 90, 101, 112, 123, 134, 145, 156, 167, 178, 189, 200};
        System.out.println("Min : "+findMin(n));
    }

    static int findMin(int[] arr){

        if(arr.length == 0){
            return -1;
        }

        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        return min;

    }

}
