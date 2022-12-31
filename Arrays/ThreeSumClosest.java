import java.util.Arrays;

public class ThreeSumClosest {

    public static int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);

        int deviation = Integer.MAX_VALUE;
        int difference = 0, answer = 0;

        for(int i = 0;i < n-2;i++)
        {
            int a = nums[i];
            int b = i+1, c = n-1;

            while (b < c)
            {
                int sum = a + nums[b] + nums[c];
                difference = Math.abs(sum - target);
                
                if(difference < deviation)
                {
                    deviation = difference;
                    answer = sum;
                }
                if(sum < target)
                {
                    b++;
                }
                else
                {
                    c--;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1,0};
        int target = -100;

        int answer = threeSumClosest(nums, target);

        System.out.println(answer);
    }
}
