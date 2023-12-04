/* Accept one character and change its case*/
import java.util.*;

class Demo
{
    void caseChange(char ch)
    {
        if(ch>='A' && ch<='Z')
        {
            ch=(char)(ch+32);
            System.out.println(ch);
        }
        else if(ch>='a' && ch<='z')
        {
            ch=(char)(ch-32);
            System.out.println(ch);
        }
    }
}
public class Program10 {
    public static void main(String arg[])
    {
        Demo dobj=new Demo();
        Scanner sobj=new Scanner(System.in);
        char ch='\0';
        System.out.println("Enter a character :");
        ch=sobj.next().charAt(0);

        dobj.caseChange(ch);

    }
    
}
