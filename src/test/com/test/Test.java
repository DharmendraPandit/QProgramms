package test.com.test;

import java.util.HashMap;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		/*Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		HashMap<String, Integer> substring = new HashMap<String, Integer>();
		for (int a0 = 0; a0 < n; a0++) {
			String op = in.next();
			String contact = in.next();

			if (op.equals("add")) {
				String s = "";
				for (int i = 0; i < contact.length(); i++) {
					s = s + contact.charAt(i);
					if (!substring.containsKey(s)) {
						substring.put(s, 1);
					} else {
						int count = substring.get(s);
						substring.put(s, count + 1);
					}
				}
			} else if (op.equals("find")) {
				int count = substring.containsKey(contact) ? substring.get(contact) : 0;
				System.out.println(count);
			}
		}*/
		
		testing();
	}
	
	static void testing(){
		int[] input = {2,3,6,6,8,9,10,10,10,12,12};
		int j = 0; 
		int i = 1;
			
		while(i < input.length){
			if(input[i] == input[j]){
				i++; 
			}else{
				input[++j] = input[i++]; 
			} 
		}
		
		/*for(int a: input){
			System.out.print(a +" ");
		}
		System.out.println();*/
		
		int[] output = new int[j+1]; 
		for(int k=0; k<output.length; k++){ 
			output[k] = input[k]; 
		} 
			
		for(int a: output){
			System.out.print(a +" ");
		}
	}
}
