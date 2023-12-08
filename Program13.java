/*Display the factors of the number */
import java.util.*;
class Demo{
    void Factors(int iNo)
    {
        int iCnt=1;
        System.out.println("Factors of number :");
        for(iCnt=1;iCnt<iNo;iCnt++)
        {
            if(iNo%iCnt==0)
            {
                System.out.print(iCnt+"\t");
            }
    
        }
    

    }
}
public class Program13 {
    public static void main(String arg[])
    {
        Demo dobj=new Demo();
        Scanner sobj=new Scanner(System.in);
        int iNo=0 ;
;
        System.out.println("Enter a number");
        iNo=sobj.nextInt();
        dobj.Factors(iNo);

    }
}
