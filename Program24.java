/*Accept total marks and obtained marks and calculate percentage */
import java.util.*;

class percentage
{
   float calculatePercent(int obtMarks,int totMarks)
   {
    float fRet=0.0f;
    System.out.println("inside calculate percent");
    System.out.println(obtMarks);
    System.out.println(totMarks);
    fRet= ((float)obtMarks/(float)totMarks)*100;
    System.out.println(fRet);
    return fRet;
   }
}

public class Program24 
{
   public static void main(String arg[])
   {
     Scanner sobj=new Scanner(System.in);
     percentage pobj=new percentage();

     int totalMarks=0,obtainedMarks=0;
     float percent=0.0f;
     System.out.println("Enter total marks");
     totalMarks=sobj.nextInt();

     System.out.println("Enter obtainedMarks");
     obtainedMarks=sobj.nextInt();

     percent=pobj.calculatePercent(obtainedMarks,totalMarks);
     System.out.println("Percentage is:"+percent);
   }
    
}
