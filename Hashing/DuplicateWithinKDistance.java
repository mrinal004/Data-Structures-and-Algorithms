/*
 Given an unsorted array that may contain duplicates.
 Also given a number k which is smaller than size of array.
 Write a function that returns true if array contains duplicates within k distance.
 Input: k = 3, arr[] = {1, 2, 3, 4, 1, 2, 3, 4}
Output: false
All duplicates are more than k distance away.

Input: k = 3, arr[] = {1, 2, 3, 1, 4, 5}
Output: true
1 is repeated at distance 3.

Input: k = 3, arr[] = {1, 2, 3, 4, 5}
Output: false

Input: k = 3, arr[] = {1, 2, 3, 4, 4}
Output: true
 */
import java.util.HashSet;


public class DuplicateWithinKDistance {
    public static void main(String[] args) {
       int arr[] = {1, 2, 3, 4, 4};
       int k = 3;

        boolean answer = DuplicatewithinK(arr, k);
        System.out.println(answer);
    }
    static boolean DuplicatewithinK(int[] arr, int k)
    {
        HashSet<Integer> hset = new HashSet<>();
        int n = arr.length;

        for(int i = 0;i < n;i++)
        {
            if(hset.contains(arr[i]))
            {
                return true;
            }

            hset.add(arr[i]);
            if(i >= k)
            hset.remove(arr[i-k]);
        }
        return false;
    }
}
