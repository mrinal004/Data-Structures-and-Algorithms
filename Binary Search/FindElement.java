import java.util.Scanner;

public class FindElement {

    public static int findElement(int[] arr,int n,int x)
    {
        int low = 0, high = n-1;

        if(n == 0 || arr == null) return -1;

        while(low <= high)
        {
            int mid = (low + high)/2;

            if(arr[mid] == x)
            return mid;

            if(arr[mid] > x)
            high = mid - 1;

            else
            low = mid + 1;

        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i < n;i++)
        arr[i] = sc.nextInt();

        int x = sc.nextInt();

        int index = findElement(arr, n, x);

        System.out.println(x +" found at "+ index);

    }
}
