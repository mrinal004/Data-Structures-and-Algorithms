/* Input: s = "the sky is blue"
Output: "blue is sky the"

Input: s = " hello w orld  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.

Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
*/



import java.util.*;

public class ReverseWords {
    static void reverseString(char[] str,int start,int end)
    {

        while(start < end)
        {
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }

    static void reverseWord(char[] str,int n)
    {
        int i = 0,j = 0;

        while(i < n)
        {
            while(i < j ||i < n && str[i] == ' ')i++;

            while(j < i || j < n && str[j] != ' ')j++;

            reverseString(str, i, j-1);
        }

        //System.out.println(str);
    }
    static void removeSpace(char[] str,int n)
    {
        int i = 0,j = 0;
        while( j < n )
        {
            while(j < n || str[j] == ' ')j++;

            while(j < n || str[j] != ' ')
            {
                str[i++] = str[j++];
            }
            
            while(j < n || str[j] == ' ')j++;

            if(j < n)
            {
                str[i++] += ' ';
            }

        }

        String newstr = new String(str);
        newstr = newstr.substring(0,i);
        System.out.println(newstr);
    }
    
    public static void main(String[] args) {
        String s = "  hello  world  ";
        
        char[] ch = s.toCharArray();
        int n = ch.length;

        reverseString(ch,0,n-1);
        reverseWord(ch,n);
        removeSpace(ch,n);
    }
}
