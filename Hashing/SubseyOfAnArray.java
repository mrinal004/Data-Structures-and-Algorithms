import java.util.*;

class SubseyOfAnArray
{
    public static void main(String[] args) {
        int[] a = {6,7,3,2,2};
        int[] b = {6,7,2,2,2,2};

        if(isSubset(a, b) == true)
        {
            System.out.println("b is subset of a");
        }
        else
        System.err.println("not a subset");
    
    }

    public static boolean isSubset(int[] a,int[] b)
    {
        //boolean answer = false;
        HashMap<Integer,Integer> hmap = new HashMap<>();

        for (int element : a) {
            int count = hmap.getOrDefault(element,0)+1;
            hmap.put(element, count);
        }

        for (int element : b) {
            //if hashmap doesnot contain the element return false
            if(!hmap.containsKey(element)) return false;
            
            //if frequency of element in hashmap is less than that in b[]
            if(hmap.get(element) == 0) return false;

            //if hmap contains element reduce the frequency
            if(hmap.containsKey(element))
            {
                hmap.put(element,hmap.get(element)-1);
            }

        }

        return true;
    }
}