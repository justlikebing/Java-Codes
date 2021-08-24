package codingPractice;

import java.util.Arrays;

public class MarksLab {

	public static void main(String[] args) {
		int[] values = { 30, 45, 60, 74, 46 };
		System.out.println("the marks are :" + Arrays.toString(values));
		Arrays.sort(values);
		System.out.println("the ascending order is:" + Arrays.toString(values));
		System.out.println("for student1");

		if (40 > values[0]) {
			System.out.println("FAIL!");
		} else if (values[0] > 40 || values[0] <= 50) {
			System.out.println("PASS!!!");
		} else if (values[0] > 51 || values[0] <= 75) {
			System.out.println("MERIT!!!");
		} else if (values[0] > 75) {
			System.out.println("DISTINCTION..");
			System.out.println("for student2");
		}
		System.out.println("for student2");
		if (40 > values[1]) {
			System.out.println("FAIL!");
		} else if (values[1] > 40 || values[1] <= 50) {
			System.out.println("PASS!!!");
		} else if (values[1] > 51 || values[1] <= 75) {
			System.out.println("MERIT!!!");
		} else if (values[1] > 75) {
			System.out.println("DISTINCTION..");
		}
		System.out.println("for student3");
		if (40 > values[2]) {
			System.out.println("FAIL!");
		} else if (values[2] > 40 || values[2] <= 50) {
			System.out.println("PASS!!!");
		} else if (values[2] > 51 || values[2] <= 75) {
			System.out.println("MERIT!!!");
		} else if (values[2] > 75) {
			System.out.println("DISTINCTION..");
		}
		System.out.println("for student4");
		if (40 > values[3]) {
			System.out.println("FAIL!");
		} else if (values[3] > 40 || values[3] <= 50) {
			System.out.println("PASS!!!");
		} else if (values[3] > 51 || values[3] <= 75) {
			System.out.println("MERIT!!!");
		} else if (values[3] > 75) {
			System.out.println("DISTINCTION..");

		}
		System.out.println("for student5");
		if (40 > values[4]) {
			System.out.println("FAIL!");
		} else if (values[4] > 40 || values[4] <= 50) {
			System.out.println("PASS!!!");
		} else if (values[4] > 51 || values[4] <= 75) {
			System.out.println("MERIT!!!");
		} else if (values[4] > 75) {
			System.out.println("DISTINCTION..");
		}

	}

}
