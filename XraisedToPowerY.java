package javaforplace;

import java.util.Scanner;

public class XraisedToPowerY {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = 1;
		for(int i = 0 ;i <= b ; i++) {
			result  = i * a ;
		}
		System.out.println(result);
	}
	

}
