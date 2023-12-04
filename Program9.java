/*accept the number from user and print that number of even numbers on screen */

import java.util.*;

class Demo{
    void PrintEven(int iNo)
    {
        int iCnt=1;
        while(iNo>=iCnt)
        {
            System.out.print(2*iCnt+"\t");
            iCnt++;

        }
    }

}
public class Program9 {
    public static void main(String arg[])
    {
        int iNo;
        Demo dobj=new Demo();
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enetr a number:");
        iNo=sobj.nextInt();
        dobj.PrintEven(iNo);
    }
    
}
