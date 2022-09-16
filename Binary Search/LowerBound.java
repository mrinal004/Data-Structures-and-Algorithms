import java.util.Scanner;


public class LowerBound {

   public static int lowerBound(int[] arr,int n,int x)
    {
        int low  = 0, high = n - 1;
        int ind = n;

        while(low <= high)
        {
            int mid = (low + high)/2;

           // if(arr[mid] == x)
            // return mid;

             if(arr[mid] >= x)
            {
                ind = mid;
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return ind;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i < n;i++)
        arr[i] = sc.nextInt();

        int x = sc.nextInt();

        int index = lowerBound(arr, n, x);

        System.out.println(x +" lower bound at "+ index);
    }
}
