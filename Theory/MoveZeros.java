import java.util.Arrays;

/* move zeroes to end of the array */

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {0,1,0,4,12};
        int n = nums.length;

        int[] arr = new int[n];
        int ptr =0;
        for(int element :nums)
        {
            if(element!=0)
            {
                arr[ptr++] = element;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
