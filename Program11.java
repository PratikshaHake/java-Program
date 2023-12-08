/*check whether the character is vowel or not */
import java.util.*;

class Demo
{
   boolean CheckVowel(char ch)
   {
     if(ch>='a' || ch<='z')
     {
       ch=(char)(ch-32);
     }

     if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')

     {
        return true;
     }
     else
     return false;
   }
}

class Program11
{
    public static void main(String arg[])
    {
        char ch='\0';
        boolean check=true;
        Scanner sobj=new Scanner(System.in);
        Demo dobj=new Demo();
        System.out.println("Enter a character");
        ch=sobj.next().charAt(0);
        check=dobj.CheckVowel(ch);

        if(check==true)
        {
            System.out.println("Character is vowel");
        }
        else{
            System.out.println("Character is not vowel");
        }
        
    }
}