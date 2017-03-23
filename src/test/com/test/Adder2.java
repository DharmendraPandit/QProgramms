package test.com.test;

public class Adder2 {

	public static void main(String[] args) {
		
		//Scanner scan = new Scanner(System.in);
		
		System.out.println("sum: "+ summation(args));
	}

	static int summation(String[] numbers){
		int[] nums = new int[numbers.length];
		int iteration = Integer.parseInt(numbers[0]);
		System.out.println(iteration);
		int sum = 0;
		for(int i=1; i<=iteration; i++){
			nums[i] = Integer.parseInt(numbers[i]);
			System.out.println(nums[i]);
			sum += nums[i];
		}
		return sum;
	}
}
