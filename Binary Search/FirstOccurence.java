import java.util.Scanner;
/* Given a sorted array containing duplicates. Find the first occurence of X in the array. */

public class FirstOccurence {

    static int firstOccurenece(int[] arr,int n,int x)
    {
        int low = 0, high = n - 1;
        int ind = -1;

        while(low <= high)
        {
            int mid = (low + high) / 2;

            if(arr[mid] == x)
            {
                ind = mid;
                high = mid - 1;
            }
            else if(arr[mid] > x)
            high = mid - 1;

            else
            low = mid + 1;
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

        int index = firstOccurenece(arr, n, x);

        System.out.println(x +" first occurence at "+ index);
    }
}
