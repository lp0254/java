/*
15. Stock Commission
Kathryn bought 600 shares of stock at a price of $21.77 per share.
She must pay her stock- broker a 2 percent commission 
for the transaction. Write a program that calculates and displays the following:
 
    1. THE AMOUNT PAID FOR THE STOCK ALONE
    2. The amount of Commmision
    3. The total amount paid for the stock plus the commission
 
*/
public class problem15
{   
   public static void main(String[] args)
   
   {
    double numOfStocks, pricePerStock, brokerCommision, totalAmount, amtNoCommision;
       
       numOfStocks=600;
       pricePerStock=21.77;
       brokerCommision=0.02;
       
       // 1. THE AMOUNT PAID FOR THE STOCK ALONE
       amtNoCommision=numOfStocks*pricePerStock;
       // 2. The amount of Commmision
       brokerCommision=brokerCommision*amtNoCommision;
       // 3. The total amount paid for the stock plus the commission
       totalAmount=amtNoCommision+brokerCommision;
       // displays the following:
       System.out.print("15. Stock Commission \nThe Amount for the stock: $"+ amtNoCommision+
                        "\nThe commission Amount: $"+ brokerCommision+
                        "\nThe Total Ammount: $"+ totalAmount);
       
       
       
    
    
   }
}
