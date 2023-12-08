/* Accept kilometers from user and calculate rate according:
 * upto 100 km rate is 25 rs per kilometer
 * after 100 km rate  is 15 km per kilometre
 */
 import java.util.*;

 class FindRate
 {
    int calculateRate(int iKilometer)
    {
        int rate=0;
         if(iKilometer<=100)
         {
            rate=iKilometer*25;
         }
         else
         {
           rate=(iKilometer-100)*15+(100*25);
         }
        return rate;
    }
 }
public class Program16 {
   public static void main(String arg[])
   {
      FindRate fobj=new FindRate();
      Scanner sobj=new Scanner(System.in);
      int iKilometer=0, iRate=0;
      System.out.println("Enter kilometers");
      iKilometer=sobj.nextInt();
      iRate =fobj.calculateRate(iKilometer);

      System.out.println("Rent : "+iRate);

   }    
}
