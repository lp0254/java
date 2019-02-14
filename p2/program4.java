import java.util.Scanner;


class program4
{
   public static void main(String args[])
   {  
       // Variable Declaration
       int score1,score2,score3,totalscore;
       String grade;
       float avg;

       // For Scanning Data user input
       Scanner in=new Scanner(System.in);

       System.out.print("Enter Test Score1=");
       score1=in.nextInt();
       System.out.print("Enter Test Score2=");
       score2=in.nextInt();
       System.out.print("Enter Test Score3=");
       score3=in.nextInt();

       //For Calculate Total
       totalscore=score1+score2+score3;

       //For Calculate Average
       avg=totalscore/3;

      
       // Conditional statemets For letter grade Grade  
           if(avg>=90)
           {  
               grade="A";
           }
           else if(avg>=80 && avg<=89)
           {
               grade="B";
          
           }
           else if(avg>=70 && avg<=79)
           {
               grade="C";
          
           }
           else if(avg>=60 && avg<69)
           {
               grade="D";
          
           }
           else
           {
               grade="F";
           }
           System.out.println("======Result======");
       System.out.println("Test Score1="+score1);
       System.out.println("Test Score2="+score2);
       System.out.println("Test Score3="+score3);
       System.out.println("==================");
       System.out.println("Score Average="+avg);
       System.out.println("Grade="+grade);
      
           
}
}