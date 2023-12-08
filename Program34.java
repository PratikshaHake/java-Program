/*Eneter the number and print the below pattern
 * number=3 Pattern=> * * * # # #
 */

 import java.util.*;

 class Demo
 {
    void Display(int iAns)
    {
        for(int i=1;i<=iAns*2;i++)
        {
            if(i<=iAns)
            {
                System.out.print("*\t");
            }
            else{
               System.out.print("#\t");
 
            }
        }
    }

 }

public class Program34 {
    public static void main(String arg[])
    { 
        Scanner sobj=new Scanner(System.in);
        Demo dobj=new Demo();
        int iNo=0;
        System.out.println("Enter the number:");
        iNo=sobj.nextInt();
        dobj.Display(iNo);
        
    }
}
