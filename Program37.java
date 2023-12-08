/*Accept height and width from user and calculate area of rectangle */
import java.util.*;

class Rectangle{
   int area(int h, int w)
   {
      int ans=0;
      ans=h*w;
      return ans;
   }
}

public class Program37 {
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        Rectangle robj=new Rectangle();
        int height=0,width=0,Ans=0;
        
        System.out.println("Enter height of rectangle:");
        height=sobj.nextInt();

        System.out.println("Enter width of rectangle:");
        width=sobj.nextInt();

        Ans=robj.area(height,width);
        System.out.println("Area of rectangle :"+Ans);

    }
    
}
