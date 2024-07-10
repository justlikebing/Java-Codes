package codingPractice;
import java.util.Scanner;
public class Greater {
	public static void main(String[] args) {
		Scanner object = new Scanner(System.in);
		System.out.println("enter a ");
		int a = object.nextInt();
		System.out.println("enter b");
		int b = object.nextInt();
		System.out.println("enter c");
		int c = object.nextInt();
		if (a > c && a > b) {
			System.out.println("a is greatest");
		} else if (b > a && b > c) {
			System.out.println("b is greatest");
		} else {
			System.out.println("c is greatest");
		}
	}
}
