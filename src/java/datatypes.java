package java;
import java.util.*;
import java.io.*;

class datatypes{
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Read number of test cases

        for(int i = 0; i < t; i++)
        {
            try
            {
                long x = sc.nextLong(); // Read the number

                System.out.println(x + " can be fitted in:");

                // Check if it can fit in a byte
                if(x >= -128 && x <= 127) System.out.println("* byte");

                // Check if it can fit in a short
                if(x >= -32768 && x <= 32767) System.out.println("* short");

                // Check if it can fit in an int
                if(x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) System.out.println("* int");

                // Check if it can fit in a long
                if(x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
    }
}
