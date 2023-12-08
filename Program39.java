/* Accept temperature in Fahrenheit and conver it into celcius */

import java.util.*;

class Temperature{
   float convert(float fah)
   {
     float cel=0.0f;
     cel=(fah-32)*5/9;
     return cel;
   }
}

public class Program39 {
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        Temperature tobj=new Temperature();
        float fah=0.0f,cel=0.0f;

        System.out.println("Enter the temperature in fahernheit :");
        fah=sobj.nextFloat();

        cel=tobj.convert(fah);
        System.out.println("Temperature in celcius :"+cel);


    }
}
