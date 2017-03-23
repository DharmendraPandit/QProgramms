package test.com.test;

import java.util.Scanner;

/*
Input:
5
1
2
3
4
5
Output:
15
 */
public class Adder {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);
		int numberCount = Integer.parseInt(in.nextLine());
		int sum = 0;
		for (int i = 0; i < numberCount; i++) {
			sum += Integer.parseInt(in.nextLine());
		}
		System.out.println(sum);
	}
}