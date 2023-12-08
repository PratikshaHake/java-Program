/*Accept a number from user and display its table in reverse order */
import java.util.*;
class RTable
{
    void Display(int iNo)
    {
        for(int i=10;i>=1;i--)
        {
            System.out.print(iNo*i+"\t");
        }
    }
}
class Program33 {
    public static void main(String arg[])
    {
       Scanner sobj=new Scanner(System.in);
       RTable tobj=new RTable();
       int iNo=0;
       System.out.println("Enter the number:");
       iNo=sobj.nextInt();
       tobj.Display(iNo);
    }
    
}
