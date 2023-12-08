/*Accept one number and print the all numbers till that number */
import java.util.*;
class Number{
    void Display(int iNo)
    {
        int iCnt=0;
        for(iCnt=1;iCnt<=iNo;iCnt++)
        {
            System.out.print(iCnt+"\t");
        }
    }

}
public class Program25 {
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        Number nobj=new Number();
        int iNo=0;
        System.out.println("Enter a number");
        iNo=sobj.nextInt();
        nobj.Display(iNo);
    }

}
