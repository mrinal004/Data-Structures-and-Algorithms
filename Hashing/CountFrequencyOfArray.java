/* Question : Given an array which may contain duplicates, print all elements and their frequencies.
 * Input :  arr[] = {10, 20, 20, 10, 10, 20, 5, 20}
Output : 10 3
         20 4
         5  1
 */
// Naive Approach : iterate over the array for each element and mark if visited and display count.
// TC : O(n^2) SC : O(n)
import java.util.Scanner;
import java.util.Arrays;

class CountFrequencyOfArray
{
    public static void main(String[] args) {
        int[] arr={10, 20, 20, 10, 10, 20, 5, 20};
        CountFrequency(arr);
    }
    static void CountFrequency(int[] array)
    {
        int n = array.length;

        // for marking visited elements make a boolean array of size n
        boolean[] marker = new boolean[n];
        Arrays.fill(marker,false);

        for(int element = 0;element < n;element++)
        {   if(marker[element] == true) continue;
            int count = 0;
            for (int i = 0; i < n; i++) {
                if(array[element] == array[i] && marker[i] !=true)
                {
                    marker[i] = true;
                    count++;
                }
            
            }
            System.out.println("Element :"+array[element]+" count: "+count);
        }
    }
}