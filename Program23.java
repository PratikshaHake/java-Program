/*Accept two numbers from user and check whether that numbers is equal*/
import java.util.*;

class Demo
{
   void check(int iNo1, int iNo2)
   {
     if(iNo1==iNo2)
     {
         System.out.println("numbers are equal");
     }
     else
     {
        System.out.println("numbers are not equal");
     }
         
   }

public float calculatePercent(int totalMarks, int obtainedMarks) {
    return 0;
}
}

public class Program23
{
  public static void main(String arg[])
  {
    Demo dobj=new Demo();
    Scanner sobj=new Scanner(System.in);
    int iNo1=0, iNo2=0;

    System.out.println("Enter first number");
    iNo1=sobj.nextInt();

    System.out.println("Enter second number");
    iNo2=sobj.nextInt();

    dobj.check(iNo1,iNo2);
  }
    
}
