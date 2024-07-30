
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PaymentContext context = new PaymentContext();

        while (true) {
            System.out.println("Select payment method: 1. Credit Card, 2. PayPal, 3. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            if (choice == 3) {
                break;
            }

            System.out.println("Enter amount to pay:");
            double amount = scanner.nextDouble();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    System.out.println("Enter Credit Card details");
                    System.out.print("Card Number: ");
                    String cardNumber = scanner.nextLine();
                    System.out.print("Card Holder Name: ");
                    String cardHolderName = scanner.nextLine();
                    System.out.print("CVV: ");
                    String cvv = scanner.nextLine();
                    System.out.print("Expiry Date: ");
                    String expiryDate = scanner.nextLine();
                    context.setPaymentStrategy(new CreditCardPayment(cardNumber, cardHolderName, cvv, expiryDate));
                    break;
                case 2:
                    System.out.println("Enter PayPal details");
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    context.setPaymentStrategy(new PayPalPayment(email));
                    break;
                default:
                    System.out.println("Invalid choice");
                    continue;
            }

            context.executePayment(amount);
        }

        scanner.close();
    }
}
