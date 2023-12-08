/*Accept distance in kilometer and convert it into meters */

import java.util.*;

class Distance
{
    int meter(float km)
    {
        int meter=0;
        meter= (int)(km*1000);
        return meter;
    }
}
public class Program38 {
    public static void main(String arg[])
    {
       Scanner sobj=new Scanner(System.in);
       Distance dobj=new Distance();
       int ans=0;
       float km=0.0f;
       System.out.println("Enter the distanc in kilometer");
       km=sobj.nextFloat();
       ans=dobj.meter(km);
       System.out.println(km +" km = "+ans+" meters");
    }
}
