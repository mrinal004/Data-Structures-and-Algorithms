import java.util.Scanner;

public class MaxSubarraySum {
    public static int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int low = 1, high = n;
        boolean possible = false;
        
        while(low < high)
        {
            int mid = low + (high-low)/2;
            
            if(func(nums,n,target,mid) == true)
            {
                possible = true;
                high = mid;
            }
            else
                low = mid + 1;
        }
        
        if(possible == true) return low;
        else
        return 0;
    }
    
    private static boolean func(int[] nums,int n,int target,int windowSize)
    {
        int  i = 0,j = 0;
        int sum = 0,maxSum = Integer.MIN_VALUE;
        
        
        while(j < n)
        {
            sum += nums[j];
            
            if(j-i+1 < windowSize) j++;
            
            else if(j-i+1 == windowSize)
            {
                maxSum = Math.max(sum,maxSum);
                
                sum -= nums[i];
                i++;
                
                j++;
            }
        }
        return maxSum >= target;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    //    int n = sc.nextInt();
    //     int[] arr = new int[n];

    //     for(int i = 0;i < n;i++)
    //     arr[i] = sc.nextInt();

        int arr[] ={2,3,1,2,4,3};
        int target = 7;
        
        int length = minSubArrayLen(target,arr);

        System.out.println("Length of the subarray with Maxsum is: "+length);
    }
}
