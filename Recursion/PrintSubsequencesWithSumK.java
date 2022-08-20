/*Print subsequences fof an array with sum equal to K
 * nums = [1,2,1] K = 2
 */
import java.util.ArrayList;
public class PrintSubsequencesWithSumK {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] nums = {1,2,1};int K = 2;
        int n = nums.length;

        // Call function to print desired subsequences
        PrintSub(0, nums, list, K, 0);
    }
    
    static void PrintSub(int index,int[] nums,ArrayList<Integer> list,int K,int sum)
    {
        if(index >= nums.length) // check till last index of the array : nums
        {
            if(K == sum) // calculated sum == K for each subsequence
            {
                System.out.println(list);
            }
            return;
        }

        //take array element at current index in ArrayList
        list.add(nums[index]);
        //compute sum with the element in List
        sum += nums[index];
        // call recursively  for next index
        PrintSub(index+1, nums, list, K, sum);

       
        // remove computed sum that was done using the taken element
        sum -= nums[index];
        // remove array element that was added previously in the ArrayList
        list.remove(list.size()-1);
        //call the function recursively for do not take condition
        PrintSub(index+1, nums, list, K, sum);
    }
}
