/* Given an array with repeated elements, the task is to find the maximum distance between two occurrences of an element.
    Input : arr[] = {3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2}
Output: 10
// maximum distance for 2 is 11-1 = 10 
// maximum distance for 1 is 4-2 = 2 
// maximum distance for 4 is 10-5 = 5  
 */
import java.util.HashMap;
public class MaxDistBetweenElements {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2};
        int res = MaxDistance(arr);
        int output = findMaxDistance(arr);
        System.out.println("MAX DISTANCE IS : "+output);
    }
    // first naive solution with TC : O(n^2)
    static int MaxDistance(int[] arr)
    {
        int n = arr.length;
        int maxDistance = 0;
        for (int i = 0; i < n; i++) 
        {   
            int distance = 0;
            
            for(int j=0;j<n;j++)
            {   
                if(arr[i] == arr[j])
                {
                    distance = j-i;
                }
            }    
            maxDistance = Math.max(distance,maxDistance);
        }
        return maxDistance;
    }
    static int findMaxDistance(int[] arr)
    {
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxDistance = -1;
        for (int i = 0; i < n; i++) {
            if(!map.containsKey(arr[i]))
            {
                map.put(arr[i],i);
            }
            else{
                maxDistance = Math.max(maxDistance,i-map.get(arr[i]));
            }
        }
        return maxDistance;
    }
}
