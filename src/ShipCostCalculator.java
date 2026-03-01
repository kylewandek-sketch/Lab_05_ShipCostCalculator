import java.util.Scanner;

public class ShipCostCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price of the item: $");
        double itemPrice = scanner.nextDouble();

        double shippingCost;
        if (itemPrice >= 100) {
            shippingCost = 0;
        } else {
            shippingCost = itemPrice * 0.02;
        }

        double totalPrice = itemPrice + shippingCost;

        System.out.printf("Shipping Cost: $%.2f%n", shippingCost);
        System.out.printf("Total Price:   $%.2f%n", totalPrice);

        scanner.close();
    }
}
