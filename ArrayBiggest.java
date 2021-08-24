package codingPractice;

import java.util.Arrays;

public class ArrayBiggest {

	public static void main(String[] args) {
		int[] i = { 4, 7, 52, 5, 10 };

		if (i[0] > i[1] && i[0] > i[2] && i[0] > i[3] && i[0] > i[4]) {
			System.out.println("the larget values is:" + i[0]);

		} else if (i[1] > i[0] && i[1] > i[2] && i[1] > i[3] && i[1] > i[4]) {
			System.out.println("the largest is  " + i[1]);

		} else if (i[2] > i[0] && i[2] > i[1] && i[2] > i[3] && i[2] > i[4]) {
			System.out.println("the greatest is " + i[2]);

		} else if (i[3] > i[0] && i[3] > i[1] && i[3] > i[2] && i[3] > i[4]) {
			System.out.println("the greatest number is " + i[3]);
		} else {
			System.out.println("the greatest is " + i[4]);
		}

	}
}