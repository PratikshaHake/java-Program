/* Accept one digit and print it into word*/

import java.util.*;

class Demo
{
  void NumberToWord(int iNo)
  {
    
    switch(iNo)
    {
        case 0: 
              System.out.println("ZERO");
              break;
        case 1:
             System.out.println("ONE");
             break;
        case 2:
             System.out.println("TWO");
             break;
        case 3:
             System.out.println("THREE");
             break;
        case 4:
             System.out.println("FOUR");
             break;
        case 5:
             System.out.println("FIVE");
             break;
        case 6:
             System.out.println("SIX");
             break;
        case 7:
             System.out.println("SEVEN");
             break;
        case 8:
             System.out.println("EIGHT");
             break;
        case 9:
             System.out.println("NINE");
             break;

    }
  }
}
public class Program30 {
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        Demo dobj=new Demo();
        int iNo=0;
        System.out.println("Enter the digit:");
        iNo=sobj.nextInt();
        dobj.NumberToWord(iNo);
    }
    
}
