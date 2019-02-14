import javax.swing.JOptionPane; // Needed for the Scanner class
/*
 7. Sales Tax
   Write a program that will ask the user to enter the amount of a purchase. 
   The program should then compute the state and county sales tax. 
   Assume the state sales tax is 4 percent and the county sales tax is 2 percent. 
   The program should display the amount of the purchase,
   the state sales tax, the county sales tax, the total sales tax, 
   and the total of the sale (which is the sum of the amount of purchase 
   plus the total sales tax). Hint: Use the value 0.02 to represent 2 percent,
    and 0.04 to represent 4 percent.
*/
public class problem7
{   
   public static void main(String[] args)
   
   {
      double temp1, temp2, amtofPurchase, sSalesTax, cSalesTax, totalTax, totalSales;
       String userInputPurchase;
       sSalesTax=0.04;
       cSalesTax=0.02;
       
       temp1 =sSalesTax;
       temp2=cSalesTax;
    
       
             
      
       
       // Get the user input
       userInputPurchase = JOptionPane.showInputDialog("what is the amount purchased? ");
       
       amtofPurchase = Double.parseDouble(userInputPurchase);
       
       // Compute the state sales tax
       sSalesTax = amtofPurchase * sSalesTax;
       
       // Compute county sales tax
       cSalesTax = amtofPurchase * cSalesTax;
       
       // Compute the total sales tax
       totalTax = sSalesTax + cSalesTax;
       
       // Compute the total purchase sales
       totalSales = amtofPurchase + totalTax;
       
       JOptionPane.showMessageDialog(null, "Purchase amount    : $" + amtofPurchase +
                                            "\nState tax            : " +temp1 +
                                            "\nCounty tax        : " + temp2 +
                                            "\nTotal tax            : $" + totalTax +
                                      "\nTotal cost        : $" + totalSales);
      
   
       
        System.exit(0);
   }

}
