import java.util.Scanner;

public class SoftwareSales

{

   public static void main( String[] args )

   {

       Scanner in = new Scanner( System.in );

       System.out.println( "Enter number of packages purchased: " );

       int count = in.nextInt();

       in.close();

       double discount = 0;

       if( count < 10 )

       {

           // no discount

       }

       else if( count <20 )

       {

           discount = ( 20 / 100.0 );

       }

       else if( count < 50 )

       {

           discount = ( 30 / 100.0 );

       }

       else if( count < 100 )

       {

           discount = ( 40 / 100.0 );

       }

       else

       {

           discount = ( 50 / 100.0 );

       }

       double costBeforeDiscount = count * 99;

       double $amountOfDiscount = costBeforeDiscount * discount;

       double $finalCost = costBeforeDiscount - $amountOfDiscount;

       System.out.printf("Your discount is: %.2f\n", $amountOfDiscount);

       System.out.printf("Your total is: %.2f\n", $finalCost);

   }

}

