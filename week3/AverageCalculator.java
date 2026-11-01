package week3;

public class AverageCalculate {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter the first number: ");
        double first = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double second = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double third = scanner.nextDouble();

        double average = (first + second + third) / 3;
        System.out.println("Average: " + average);

        scanner.close();
    }
   
}
