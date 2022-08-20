/* Print all subsequences of a given array */

import java.util.ArrayList;
public class PrintingSubsequences {
    public static void main(String[] args) {
        int [] nums = {1,2,1};
        ArrayList<Integer> arr = new ArrayList<>();
        PrintSub(0,arr,nums);

    }
    static void PrintSub(int index,ArrayList<Integer> arr,int[] nums)
    {
        // This function body will be a standard template for 
        // such problems

        //Base Condition : stop when index is more than array length
        if(index == nums.length)
        {
            System.out.println(arr);
            return;
        }
        arr.add(nums[index]);// choose array element at next index
        PrintSub(index+1,arr,nums);
        arr.remove(arr.size()-1);// do not choose array element at next index
        PrintSub(index+1,arr,nums);
        
    }
}
