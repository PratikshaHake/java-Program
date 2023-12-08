/* School fees according to standard
 */
import java.util.*;
 class School
 {
      void Fees(int iStandard)
      {
        switch(iStandard)
        {
            case 1:
               System.out.println("Fees for standard 1 is 10000");
               break;
            case 2:
               System.out.println("Fees for standard 2 is 20000");
               break;
            case 3:
               System.out.println("Fees for standard 3 is 30000");
               break;
            case 4:
               System.out.println("Fees for standard 4 is 40000");
               break;   
            case 5:
               System.out.println("Fees for standard 5 is 10000");
               break;
            default:
                System.out.println("Invalid standard");
        }
      }
 }
public class Program15 {
    public static void main(String arg[])
    {
    School obj=new School();
    Scanner sobj=new Scanner(System.in);
    int iStd=0;
    System.out.println("Enter the standerd that you want to the fess of that stadard");
    iStd=sobj.nextInt();
    obj.Fees(iStd);

}
}
