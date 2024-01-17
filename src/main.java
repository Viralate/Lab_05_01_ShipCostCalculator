import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        //initalize scanner to check for user input
        Scanner scanner = new Scanner(System.in);

        //output and input
        System.out.print("Please enter the price of the item: ");
        double price = scanner.nextDouble();

       //set variables and process
       double shippingCost = 0;
       if (price < 100) {
            shippingCost = 0.02 * price;
       }
    
       //process total price
       double totalPrice = price + shippingCost;

       // print results
       System.out.println("The total shipping cost is: $" + shippingCost);
       System.out.println("The total price is: $" + totalPrice);

    









        
    }
}
