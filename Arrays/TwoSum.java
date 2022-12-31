import java.util.Arrays;
import java.util.Scanner;

class TwoSum
{
    public static void main(String[] args) {
        int[] number = {2,3,5,6,7,8,9};
        int target = 14;

        int[] answer = new int[2];
        answer = twoSum(number, target);
        System.out.println(Arrays.toString(answer));
    }

    public static int[] twoSum(int[] arr,int target)
    {
        // Brute force approach

        int n = arr.length;

        for(int i = 0;i < n;i++)
        {
            for(int j = i+1;j < n;j++)
            {
                if(arr[i] + arr[j] == target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }
}