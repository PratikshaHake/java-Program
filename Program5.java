/* accept a number print the * on screen with that number times */
import java.util.*;
class Demo{
    void Display(int iNo)
    {
        int iCnt=0;
        for(iCnt=0;iCnt<iNo;iCnt++)
        {
            System.out.print("*\t");
        }
    }
}

public class Program5 {
    public static void main(String arg[])
    {
       Demo dobj=new Demo();
       Scanner sobj=new Scanner(System.in);
       int iNo=0;
       System.out.println("Enter number ");
       iNo=sobj.nextInt();
       dobj.Display(iNo);

    }
    
}
