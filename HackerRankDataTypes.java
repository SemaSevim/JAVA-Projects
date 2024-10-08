import java.util.*;
import java.io.*;



class HackerRankDataTypes{
    public static void main(String []argh)
    {

        Scanner sc = new Scanner(System.in);
        long t=sc.nextLong();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                else if(x>= -32768 && x<=32767)System.out.println("* short");
                else if(x>= -2147483648 && x<=2147483648)System.out.println("* int");
                else if(x>= -9223372036854775808L && x<=9223372036854775808L)System.out.println("* long");
            
                
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}


