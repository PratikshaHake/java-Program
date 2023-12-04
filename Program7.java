/*Accept two numbers from user and print first number on the screen second number times */
import java.util.*;

class Demo{
    void Display(int iNo1,int iNo2)
    {
        int iCnt=0;
        if(iNo2<0)
        {
            iNo2=-iNo2;
        }
        for(iCnt=0;iCnt<iNo2;iCnt++)
        {
            System.out.print(iNo1+"\t");
        }
    }
}

public class Program7 {
    public static void main(String arg[])
    {
        Demo dobj=new Demo();
        Scanner sobj=new Scanner(System.in);
        int iNo1,iNo2;
        System.out.println("Enter first number");
        iNo1=sobj.nextInt();

        System.out.println("Enter second number");
        iNo2=sobj.nextInt();

        dobj.Display(iNo1,iNo2);


    }
    
}
