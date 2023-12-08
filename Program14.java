/*Hotel discount bill
 * if bill is greater than 500 and less than 1500 then discount is 10%
 * if bill is grater than 1500 then discount is 15%
 */
import java.util.*;

 class Hotel{
    float calculateBill(float bill)
    {
        if(bill>500 && bill<1500)
        {
            bill=bill-(bill*10/100);
        }
        else if(bill>=1500)
        {
            bill=bill-(bill*15/100);
        }
       
        return bill;
        
    }
}
public class Program14 {
public static void main(String arg[])
{
    Hotel hobj=new Hotel();
    Scanner sobj=new Scanner(System.in);
    float iAmount=0;
    float FinalAmount=0.0f;
    System.out.println("What is your hotel bill amount");
    iAmount=sobj.nextFloat();

    FinalAmount=hobj.calculateBill(iAmount);

    System.out.println("Youe bill after discount is :"+FinalAmount);
}    
}
