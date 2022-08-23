/* Leetcode 39
 * given array with distinct integers-no repetetions and target value = target
 * find all possible combinations/subsequences with element repetitions that add add up to target
 * 
 * arr = 2 3 6 7   target : 7
 * output : 2 2 3 , 7
 */
import java.util.ArrayList;
import java.util.List;
public class CombinationSum1 {
    public static List<List<Integer>> combinationSum(int[] array, int target)
    {
        //function to return list of combinations of elements that add up to given target
        List<List<Integer>> answer = new ArrayList<>();
        findCombinations(0,target, new ArrayList<>(),answer, array);
        return answer;
    
    }
    private static void findCombinations(int index,int target,List<Integer> list,List<List<Integer>> answer,int[] array)
    {
        //base condition : when index is equal to length of the original array
        if(index == array.length)
        {
            if(target == 0)
            {
                answer.add(list);
            }
            //return empty arraylist 
            return;
        }
        // to find combinations we take the method of pick or not pick index elemetnts
        // since same index element picking is allowed we can go for the below approach
        // we pick elements if they are <= their target
        if(array[index] <= target)
        {   
            list.add(array[index]);
            findCombinations(index, target - array[index],new ArrayList<>(list),answer, array);
            list.remove(list.size()-1);
        }
        findCombinations(index + 1, target,new ArrayList<>(list),answer, array);
    
    }
    public static void main(String[] args) {
        int[] array = {2,3,6,7};
        int target = 7;
        System.out.println("Combinations are: "+combinationSum(array,target));
    }
}
