  import java.util.Scanner; // Needed for the Scanner class

public class problem10
{   
   public static void main(String[] args)
   
   {
      double firstexam, secExam, thirdexam,avgExamScore;
      
      
      // Create a Scanner object to read input.
   Scanner keyboard = new Scanner(System.in);

   // Get the first
   System.out.print("What is your First Exam Score? ");
   firstexam = keyboard.nextInt();
   // Get the 2nd
   System.out.print("What is your Second Exam Score? ");
   secExam = keyboard.nextInt();
   // Get the 3rd
   System.out.print("What is your Third Exam Score? ");
   thirdexam = keyboard.nextInt();

   avgExamScore=(firstexam+secExam+thirdexam)/3;
   // Consume the remaining newline.
    keyboard.nextLine();

   // Printing the user Test Score
   System.out.print("First Exam Score: "+firstexam+
                     "\nSecond Exam Score: "+secExam+
                      "\nThird Exam Score: "+thirdexam+
                       "\nThe Average Exam Score: "+avgExamScore );
   
   System.exit(0);
   }

}
