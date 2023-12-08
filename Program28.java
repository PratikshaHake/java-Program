/*Accept a number and print first 5 multiples of that number */
import java.util.*;

class FiveTable
{
    void Display(int no)
    {
        for(int i=1;i<=5;i++)
        {
            System.out.print(no*i+"\t");
        }
    }
}
public class Program28 {
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        FiveTable fobj=new FiveTable();
        int iNo=0;
        System.out.println("Enter the number:");
        iNo=sobj.nextInt();
        fobj.Display(iNo);
    }
}
