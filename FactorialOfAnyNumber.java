package javaforplace;

import java.util.Scanner;

public class FactorialOfAnyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value:");
		int n = sc.nextInt();
		int factorialOf = 1;
		for(int i = n ; i >= 1 ; i--) {
			factorialOf = factorialOf * i;
		}
		System.out.println(factorialOf);

	}

}
