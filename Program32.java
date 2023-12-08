/*Accept a number from user and display its table */
import java.util.*;

class Table{
      void Display(int iNo)
      {
        for(int i=1;i<=10;i++)
        {
            System.out.print(iNo*i+"\t");
        }
      }
}
public class Program32 {
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        Table tobj=new Table();
        int iNo=0;
        System.out.println("Enetr the number:");
        iNo=sobj.nextInt();
        tobj.Display(iNo);
    }
}
