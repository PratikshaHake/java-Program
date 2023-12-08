/*Accept one number and print that number line
 * ex-number =4
 * o/p-> -4 -3 -2 -1 0 1 2 3 4
 */

 import java.util.*;

 class Line{
    void Display(int No)
    {
        int iCnt=0;
        for(iCnt=-No;iCnt<=No;iCnt++)
        {
            System.out.print(iCnt+"\t");
        }
    }

 }
public class Program26 {
    public static void main(String arg[])
    {
      Scanner sobj=new Scanner(System.in);
      int iNo=0;
      Line lobj=new Line();
      System.out.println("Enter the number");
      iNo=sobj.nextInt();
      lobj.Display(iNo);

    }
    
}
