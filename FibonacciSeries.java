package javaforplace;
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value:");
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		System.out.println(a + " ");
		System.out.println(b + " ");
		for (int i = 0; i < n - 2; i++) {
			int c = a + b;
			System.out.println(c + " ");
			a = b;
			b = c;

		}
	}
}
