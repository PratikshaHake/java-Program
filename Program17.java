/* Accept the number from user and display multiplication of its factor*/


import java.util.*;
class Demo{
    int FactorsMult(int iNo)
    {
        int iCnt=1,Mult=1;
    
          for(iCnt=1;iCnt<iNo;iCnt++)
        {
            if(iNo%iCnt==0)
            {
               Mult*=iCnt ;
            }
    
        }
    
      return Mult;
    }
}
public class Program17 {
    public static void main(String arg[])
    {
        Demo dobj=new Demo();
        Scanner sobj=new Scanner(System.in);
        int iNo=0 ,Fmult=0;
;
        System.out.println("Enter a number");
        iNo=sobj.nextInt();
        Fmult=dobj.FactorsMult(iNo);
        System.out.println("Multiplication of facters of number is :"+Fmult);

    }
}
