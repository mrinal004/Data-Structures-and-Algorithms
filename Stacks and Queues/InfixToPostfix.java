/* Input : A + B * C + D
 * Output : ABC*+D+
 */

import java.util.Scanner;
import java.util.Stack;



import java.util.ArrayDeque;
import java.util.Deque;

public class InfixToPostfix
{

    public static int precedence(char ch)
    {
        switch(ch)
        {
            case '+':
            case '-': return 1;

            case '*':
            case '/': return 2;

            case '^' : return 3;
        }
        return -1;
    }
    public static String inTopost(String infix)
    {
        // string to store postfix expression
        String result = new String();

        //create empty stack
        Deque<Character> stack = new ArrayDeque<>();

        // scan the infix expression
        for(char ch : infix.toCharArray())
        {
            //if operand is encountered
            if(Character.isLetterOrDigit(ch))
            result += ch;
            
            // if character is opening parantheses
            else if(ch == '(')
            stack.push(ch);

            //if character is closing parantheses then from the stack keep popping the elements to result string until a closing
            // parantheses is encountered.
            else if(ch == ')')
            {
                while(!stack.isEmpty() && stack.peek() != '(')
                {
                    result += stack.pop();
                }

                stack.pop();
            }

            //if operators are encountered then compare the precedence of the operator with the operator on top of the stack
            // operator with higher precedence than the top stack character--> push the element on the stack or else
            // keep popping and adding tothe result
            else
            {
                while(! stack.isEmpty() && precedence(ch) <= precedence(stack.peek()))
                {
                    result += stack.pop();
                }

                stack.push(ch);
            }
        }

        while(! stack.isEmpty())
        result += stack.pop();

        return result;
    }
    public static void main(String[] args) {
        String infix = "a+b*(c^d-e)^(f+g*h)-i";

        String postfix = inTopost(infix);
        System.out.println(postfix);
    }
}