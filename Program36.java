/*Accept radius of circle from user and calculate its area and circumference */

import java.util.*;

class Circle{
    float area(int radius)
    {
      float Ans=0.0f;
      Ans=3.14f*radius*radius;
      return Ans;
    }

    float circumference(int radius)
    {
        float Ans=0.0f;
        Ans=2*3.14f*radius;

        return Ans;
    }

}
public class Program36 {
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        Circle cobj=new Circle();
        int radius=0;
        float iRet=0.0f;
        System.out.println("Enter the radius of circle:");
        radius=sobj.nextInt();

        iRet=cobj.area(radius);
        System.out.println("Area of circle :"+iRet);

        iRet=cobj.circumference(radius);
        System.out.println("Circumference of circle :"+iRet);
    }
}
