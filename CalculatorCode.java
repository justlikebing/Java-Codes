package javaforplace;
import java.util.Scanner;

public class CalculatorCode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First number:");
		int a = sc.nextInt();
		System.out.println("Enter the second value:");
		int b = sc.nextInt();
		System.out.println("Enter the operand!");
		sc.nextLine();
		char op = sc.nextLine().charAt(0);

		int result = 0;
		switch (op) {
		case '+':
			result = a + b;
			break;
		case '-':
			result = a - b;
			break;
		case '*':
			result = a * b;
			break;
		case '/':
			result = a / b;
			break;
		case '%':
			result = a % b;
			break;
		default:
			System.out.println("INVALID!!!!!!!");
		}
		System.out.println(result);

	}

}
