package Recursion;

public class Recursion {
    public static void main(String[] args) {
        fun(0);
    }

    // function to demonstrate recursion
    static void fun(int counter)
    {
        //if (counter == 3)
          //  return;
        
        System.out.println(counter);
        counter++;
        fun(counter);
    }
}


