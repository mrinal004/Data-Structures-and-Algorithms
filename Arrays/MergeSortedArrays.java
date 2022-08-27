import java.util.Arrays;

public class MergeSortedArrays {
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        // idea is to use two pinter approach and fill the array backwards from the back
        int pointer1 = m - 1;
        int pointer2 = n - 1;
        int index = m+n-1;
        
        while(pointer2 >= 0 && pointer1 >= 0)
        {
            if(nums2[pointer2] > nums1[pointer1] )
            {
                nums1[index] = nums2[pointer2];
                index--;
                pointer2--;
            }
            else
            {
                nums1[index] = nums1[pointer1];
                pointer1--;
                index--;
                
            }
        }
        // case when nums1 is empty so just copy values of nums2 in nums1
        while(pointer2 >= 0)
        {
            nums1[index--] = nums2[pointer2--];
        }
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};int m = 3;
        int[] nums2 = {2,5,6};int n = 3;
        merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));
    }
    
}
