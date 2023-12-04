/*check wether the number is even or odd */
import java.util.*;

class Demo{
    void Display(int iNo)
    {
        if(iNo%2==0)
        {
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Nmuber is odd");
        }
    }
}

public class Program8 {
    public static void main(String arg[])
    {
         Demo dobj=new Demo();
         Scanner sobj=new Scanner(System.in);
         int iNo=0;
         System.out.println("Enetr a number:");
         iNo=sobj.nextInt();

         dobj.Display(iNo);
    }
    
}
