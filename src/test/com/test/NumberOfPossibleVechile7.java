package test.com.test;

public class NumberOfPossibleVechile7 {

	static StringBuffer vechile = new StringBuffer();
	static boolean isValid = true;
	
	public static void main(String[] args) {
		int wheels = 10;
		printBikes(wheels);
		System.out.println("("+ vechile.substring(0, vechile.length()-1) +")");
		vechile = new StringBuffer();
		printCarsBike(wheels);
		System.out.println("("+ vechile.substring(0, vechile.length()-1) +")");
	}
	
	static void printCarsBike(int wheels){
		
		if(wheels >= 4){
			wheels = wheels - 4;
			vechile.append("4,");
			printCarsBike(wheels);
		}else{
			wheels = wheels - 2;
			vechile.append("2,");
		}
	}

	static void printBikes(int wheels){
		//System.out.println(2%10);
		if(wheels < 2 && isValid == true){
			isValid = false;
			System.out.println("Invalid wheels...");
			System.exit(0);
		}
		
		if(wheels >= 2){
			isValid = false;
			wheels = wheels - 2;
			vechile.append("2,");
			printBikes(wheels);
		}
	}
}
