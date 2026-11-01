package week3;

public class ItemCost {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter the price of the item: ");
        double price = scanner.nextDouble();

        System.out.print("Enter the quantity of the item: ");
        int quantity = scanner.nextInt();

        double totalCost = price * quantity;
        System.out.println("Total cost: " + totalCost);

        scanner.close();
    }
}
