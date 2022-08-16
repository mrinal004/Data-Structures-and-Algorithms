/*Given an array with n positive integers. We need to find the minimum number of operation to make all elements equal.
 We can perform addition, multiplication, subtraction or division with any element on an array element. 
 Input : arr[] = {1, 2, 3, 4}
Output : 3
 */
import java.util.*;

public class MinOperation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int res = MinimumOperations(arr);
        System.out.println(res);
    }
    static int MinimumOperations(int[] arr)
    {
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();

        //count frequency of each element
        for(int element : arr)
        {
            if(!map.containsKey(element))
            {
                map.put(element,1);
            }
            else
            {
                map.put(element,map.get(element)+1);
            }
        }
        int maxFreq = 0;
        // get max frequency elements
        Set<Integer> set = map.keySet();
        for (int ele : set) {
            if(maxFreq < map.get(ele))
            {
                maxFreq = map.get(ele);
            }
        }
        return (n-maxFreq);

    }
}
