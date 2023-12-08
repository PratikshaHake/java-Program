/*Accept a number and print all odd numbers till that number */
import java.util.*;
class OddNumber
{
    void DisplayOdd(int no)
    {
      int i=0;
      for(i=1;i<=no;i++)
      {
        if(i%2!=0)
        {
            System.out.print(i+"\t");
        }
      }
    }
}
public class Program27 {
    public static void main(String arg[])
    {
       Scanner sobj=new Scanner(System.in);
       OddNumber obj=new OddNumber();
       int iNo=0;
       System.out.println("Enter the number:");
       iNo=sobj.nextInt();
       obj.DisplayOdd(iNo);
    }
    
}
