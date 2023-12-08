/*Enter a dollar value and convert it into rupee
 * ex- enter doolor=5 rupee=417.2
 */
import java.util.*;

 class Currency
 {
     float convert(int dollar)
     {
        float Ans=0.0f;
        Ans=(float)dollar*83.44f;
        return Ans;
     }
 }
public class Program35 {
    public static void main(String arg[])
    {
       Scanner sobj=new Scanner(System.in);
       Currency cobj=new Currency();
       int dollar=0;
       float Rupee=0.0f;
       System.out.println("Enter the money in dollar:");
       dollar=sobj.nextInt();
       Rupee=cobj.convert(dollar);
       System.out.println(dollar+"$ = Rs."+Rupee);


    }
    
}
