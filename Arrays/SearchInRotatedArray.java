

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int ans = search(nums,target);
        System.out.println(ans);
    }
    public static int search(int[] nums, int target) {
        int n = nums.length;
        // define start & end positions for the search space
        int start = 0, end = n - 1;
        
        // loop the search space
        while(start <= end)
        {
            //calculate mid
            int mid = start + (end - start)/2;
            
            //if mid element is target return mid index
            if(nums[mid] == target) return mid;
            
            // search in sorted space
            if(nums[start] <= nums[mid]) // sorted half
            {
                if(target < nums[mid] && target > nums[start])
                {
                    end = mid - 1;
                }
                else
                {
                    start = mid + 1;
                }
            }
           else 
            {
                if(target < nums[mid] && target < nums[end])
                {
                    start = mid + 1;
                }
                else 
                {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
