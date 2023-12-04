/*Accept a number from user if the number is greater than 10 then print Hello otherwise print Demo */
import java.util.*;

class Demo{
    void Display(int iNo)
    {
        if(iNo>10)
        {
            System.out.println("Hello");
        }
        else{
            System.out.println("Demo");
        }
    }
}

public class Program6 {
    public static void main(String arg[])
    {
        Demo dobj=new Demo();
        Scanner sobj=new Scanner(System.in);
        int iNo=0;
        System.out.println("Enter a number");
        iNo=sobj.nextInt();
        dobj.Display(iNo);


    }
    
}
