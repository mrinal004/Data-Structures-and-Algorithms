import java.util.*;

public class ReverseArray {

    static void reverse(int[] arr,int n)
    {
        int first = 0,last = n-1;
        while(first <= last)
        {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	 
	 int t = sc.nextInt();
	 while(t-- > 0)
	 {
	     int n = sc.nextInt();
	     int[] arr = new int[n];
	     for(int i = 0;i < n;i++)
	     {
	         arr[i] = sc.nextInt();
	     }
	     reverse(arr,n);
	     for(int ele : arr)
	     System.out.print(ele);
	     
	 }
    }
}
