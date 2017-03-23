package test.com.test;

import java.util.Scanner;

/*
Staircase example
*/
public class StairCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		
		/*
		 * Input:
			5
			Output:
				#
			   ##
			  ###
			 ####
			#####
		 */
		for (int j = 0; j < num; j++) {
			for (int i = 1; i <= num; i++) {
				//System.out.print(i < num - j ? " " : "#");
				if(i < (num - j)){
					System.out.print(" ");
				}else{
					System.out.print("#");
				}
			}
			System.out.println("");
		}

		/*
		 * Input:
			5
			Output:
			#
			##
			###
			####
			#####
		 */
		for(int i = 0; i <= num; i++){
			System.out.println();
			for(int j = 0; j < i; j++){
				System.out.print("#");
			}
		}
	}

}
