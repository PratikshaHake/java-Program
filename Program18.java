/*Accept number from user and print its factors in decreasing order */

import java.util.*;

class Demo{
    void DisplayFactor(int iNo)
    {
        int fact=0;
        fact=iNo/2;
        while(fact>0)
        {
            if(iNo%fact==0)
            {
                System.out.print(fact+"\t");
            }
            fact--;
        }
    }
}

public class Program18 {
    public static void main(String arg[])
    {
        Demo dobj=new Demo();
        Scanner sobj=new Scanner(System.in);   
        int iNo=0;
        System.out.println("Enter a number");
        iNo=sobj.nextInt();
        dobj.DisplayFactor(iNo);
    }
    
}
