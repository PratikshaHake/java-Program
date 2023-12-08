/*Display the even factors of the number */
import java.util.*;
class Demo{
    void EvenFactor(int iNo)
    {
        int iCnt=1;
        if(iNo%2==1)
        {
            System.out.println("Number is odd it can not have even factors");
        }
        else{
        for(iCnt=2;iCnt<iNo;iCnt+=2)
        {
            if(iNo%iCnt==0)
            {
                System.out.print(iCnt+"\t");
            }
    
        }
    }

    }
}
public class Program12 {
    public static void main(String arg[])
    {
        Demo dobj=new Demo();
        Scanner sobj=new Scanner(System.in);
        int iNo=0;
;
        System.out.println("Enter a number");
        iNo=sobj.nextInt();
        dobj.EvenFactor(iNo);

    }
}
