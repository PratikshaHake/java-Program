/*Accept a number from user and display its digit in reverse order */

import java.util.*;

class number{
    void Display(int iNo)
    {
    
        while(iNo>0)
        {
            System.out.print(iNo%10);
            iNo=iNo/10;
        }
    }
}
public class Program44 {
    public static void main(String arg[])
    { 
        Scanner sobj=new Scanner(System.in);
        number nobj=new number();
        int iNo=0;
        System.out.println("Enter the number :");
        iNo=sobj.nextInt();
        nobj.Display(iNo);


    }
    
}
