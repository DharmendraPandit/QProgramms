package test.com.test;

public class WalkToRemember5 {
	
	public static void main(String[] args) {

		String seqOfDirections = "rrlrlr";
		int lengthOfNumLine = 6;
		int startingPoint = 1;
		int endingPoint = 2;
		
		distinctMoves(seqOfDirections, lengthOfNumLine, startingPoint, endingPoint);
	}
	
	static void distinctMoves(String seqOfDirections, int lengthOfNumLine, int startingPoint, int destination){
		
		char[] direction = seqOfDirections.toCharArray();
		int[] numbers = {0,1,2,3,4,5};
		int index = 1;
		for(int i=0; i<numbers.length; i++){
			if(numbers[i] == startingPoint){
				index = i;
				break;
			}
		}
		//System.out.println("index: "+ index);
		int move = 0;
		boolean isDestinationFound = false;
		for(int i=0; i<direction.length; i++){
			if(direction[i] == 'r'){
				index += 1;
			}else{
				index -= 1;
			}
			move++;
			if(i == (direction.length - 1) && numbers[index] == destination){
				isDestinationFound = true;
				break;
			}
		}
		
		//One step consider left/right if destination not found above
		if(isDestinationFound == false){
			if(numbers[index+1] == destination){
				move++;
			}else if(numbers[index-1] == destination){
				move++;
			}else{
				System.out.println("Input is not correct!");
			}
		}
		System.out.println("Total move: "+ move);
	}
}
