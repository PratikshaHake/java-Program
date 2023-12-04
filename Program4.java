/*Check wether the number is divisible by 5 or not */
import java.util.*;

class Demo
{
    boolean check(int iNo)
    {
        if(iNo%5==0)
    
            return true;
         else
          return false;
    }
}
public class Program4 {
    public static void main(String arg[])
    {
        Demo dobj=new Demo();
        Scanner sobj=new Scanner(System.in);
        int iNo;
        boolean bRet=true;
        System.out.println("Enter a Number");
        iNo=sobj.nextInt();
        bRet=dobj.check(iNo);

        if(bRet==true)
        
            System.out.println("divisible by 5");
        
        else
        
            System.out.println("not divisible by 5");
        



    }
    
}
