import java.util.*;
public class ThreeSum {
    
    public static void main(String[] args) {
        List<List<Integer>> answer = new ArrayList<>();

       int[] nums = {-1,0,1,2,-1,-4};
        //int[] nums = {0,0,0,0};

        answer = triSum(nums);
        System.out.println(answer);
    }

    public static List<List<Integer>> triSum(int[] nums)
    {
        List<List<Integer>> answer = new ArrayList<>();

        Arrays.sort(nums);
        int n  = nums.length;

        for (int i = 0; i < n-2; i++) {
            
            int target = 0 - nums[i];
            int low = i+1, high = n-1;

            if(i==0 || i > 0 && nums[i] != nums[i-1])
            {
                while(low < high)
            {
                if(nums[low] + nums[high] == target)
                {
                    answer.add(Arrays.asList(nums[low],nums[high],nums[i]));

                    while(low < high && nums[low] == nums[low+1]) low++;
                    while(low < high && high+1 < n && nums[high] == nums[high+1]) high--;

                    low++;
                    high--;
                }
            }
            }
        }
        return answer;
    }
}
