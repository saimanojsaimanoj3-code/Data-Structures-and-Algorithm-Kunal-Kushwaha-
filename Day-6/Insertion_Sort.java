public class Insertion_Sort
{
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int n=arr.length;
        InsertionSort(arr,n);
        System.out.println("Sorted array: ");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
    }
    public static void InsertionSort(int a[],int n)
	{
		for(int i=1;i<n;i++)
		{
			int val=a[i];
			int hole=i;
			while(hole>0&&a[hole-1]>val)
			{
				a[hole]=a[hole-1];
				hole=hole-1;
			}
			a[hole]=val;
		}
		print(a,n);
	}
}
