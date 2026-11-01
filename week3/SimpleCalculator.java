package week3;

public class SimpleCalculator {
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		System.out.print("Enter the first number: ");
		double first = scanner.nextDouble();

		System.out.print("Enter an operator (+, -, *, /): ");
		String operator = scanner.next();

		System.out.print("Enter the second number: ");
		double second = scanner.nextDouble();

		switch (operator) {
			case "+":
				System.out.println("Result: " + (first + second));
				break;
			case "-":
				System.out.println("Result: " + (first - second));
				break;
			case "*":
				System.out.println("Result: " + (first * second));
				break;
			case "/":
				if (second == 0) {
					System.out.println("Error: Cannot divide by zero.");
				} else {
					System.out.println("Result: " + (first / second));
				}
				break;
			default:
				System.out.println("Error: Invalid operator.");
		}

		scanner.close();
	}
}
