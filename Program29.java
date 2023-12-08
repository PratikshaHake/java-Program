/*Accept a number from user and check whether it is small,medium or large  */

import java.util.*;

class Demo{
    void check(int iNo)
    {
        if(iNo<=50)
        {
            System.out.println("Number is small");
        }
        else if(iNo>50 && iNo<=100)
        {
            System.out.println("Number is medium");
        }
        else 
        {
            System.out.println("Number is large");
        }
    }
}

public class Program29 {
    public static void main(String arg[])
    {
       Scanner sobj=new Scanner(System.in);
       Demo dobj=new Demo();
       int iNo=0;
       System.out.println("Enter the number");
       iNo=sobj.nextInt();
       dobj.check(iNo);
    }
    
}
