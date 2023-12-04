/*Division of two numbers */
import java.util.*;

class Demo
{
    int division(int iNo1,int iNo2)
    {
        int iRet=0;
        try
        {
           iRet=iNo1/iNo2;
        }
        catch(ArithmeticException eobj){
            System.out.println("Divide by zeo error");
        }

        return iRet;
    }
}
class Program1
{
    public static void main(String arg[])
    {
        Demo dobj=new Demo();
        int No1,No2,Result=0;
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter first number");
        No1=sobj.nextInt();

        System.out.println("Enter second number");
        No2=sobj.nextInt();

        Result=dobj.division(No1,No2);
        System.out.println("Division of two number is :"+Result);


    }
}