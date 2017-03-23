package test.com.test;

public class AllSubsetOfArray6 {

	public static void main(String[] args) {

		char[] array = { 'a', 'b', 'c' };
		printSubsetOfArray(array);
		//System.out.println(1 & (1<<2));
	}

	static void printSubsetOfArray(char[] array) {
		// Run a loop for printing all 2^n subsets one by one
		for (int i = 0; i < (1 << array.length); i++) {
			System.out.print("{ ");
			for (int j = 0; j < array.length; j++) {
				// (1<<j) is a number with jth bit 1 so when we 'and' them with the
				// subset number we get which numbers are present in the subset and which are not
				if ((i & (1 << j)) > 0) {
					System.out.print(array[j] + " ");
				}
			}
			System.out.println("}");
		}
	}
}
