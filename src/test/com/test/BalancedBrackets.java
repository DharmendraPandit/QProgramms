package test.com.test;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets { 
	    
	    public static boolean isBalanced(String expression) {
		 Stack<String> sb = new Stack<String>();
	        String[] brackets = expression.split("");
	        for(int i=0; i<brackets.length; i++){
	            if(!sb.isEmpty() && makeBrackets(brackets[i], sb.peek())){
	                sb.pop();
	            }else{
	                sb.push(brackets[i]);
	            }
	        }
	        if(sb.isEmpty()){
	            return true;
	        }else{
	            return false;
	        }
	    }
	    
	    public static boolean makeBrackets(String inputBracket, String topElement){
	        String concate = topElement + inputBracket;
	        switch(concate){
	            case "()":
	                return true;
	            case "[]":
	                return true;
	            case "{}":
	                return true;
	            default:
	                return false;
	        }
	    }
	  
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int t = in.nextInt();
	        System.out.println("t: "+ t);
	        String[] expression = new String[t];
	        for (int a0 = 0; a0 < t; a0++) {
	            expression[a0] = in.next();
	            //System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
	        }
	        System.out.println();
	        for(int i=0; i<expression.length; i++){
	        	System.out.println( (isBalanced(expression[i])) ? "YES" : "NO" );
	        }
	    }
	
}
