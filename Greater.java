package codingPractice;

import java.util.Scanner;

public class Greater {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter a ");
		int a = obj.nextInt();
		System.out.println("enter b");
		int b = obj.nextInt();
		System.out.println("enter c");
		int c = obj.nextInt();
		if (a > c && a > b) {
			System.out.println("a is greatest");
		} else if (b > a && b > c) {
			System.out.println("b is greatest");
		} else {
			System.out.println("c is greatest");
		}
	}
}