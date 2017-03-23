package test.com.test;

public class tt {

	public static void main(String[] args) {

		int a[] = { 5, 2, 6, 3, 4, 5, 2 };

		//getTime(a, a[a.length - 1]);
		//System.out.println(waitingTime(a, a[a.length-1]));
		//System.out.println(getTime(a, a[a.length-1]));
		
		int n = a[0];
		int[] b = new int[n];// main

		for (int i = 0; i < n; i++) {
			b[i] = a[i + 1];
		}
		
		System.out.println(getTime1(b, a[a.length-1]));
	}
	
	static long getTime1(int[] tickets, int p) {
		
		
		int lenght = tickets.length;
		int noOfIteration = 1000000;
		int countZero = 0;
		int valueOfTickets = tickets[p];
		int i=0;
		search: for (i = 0; i < noOfIteration; i++) {
			int temp = 0;
			boolean flag = true;
			for (int j = 0; j < lenght - 1; j++) {
				if (tickets[lenght - 1] == 0) {
					lenght = lenght - 1;
					countZero++;
					if ((valueOfTickets-1) == countZero) {
						break search;
					}
				}

				temp = tickets[j];

				tickets[j] = tickets[j + 1];
				if (flag) {
					flag = false;
					temp = temp - 1;
				}
				tickets[j + 1] = temp;

			}
		}

		
		return i;
	}
	

	static long getTime(int[] a, int p) {
		int n = a[0];
		int[] b = new int[n];// main

		for (int i = 0; i < n; i++) {
			b[i] = a[i + 1];
		}
		/*for (int i = 0; i < n; i++) {
			System.out.print(b[i] + " ");
		}*/
		// rotation
		int lenght = b.length;
		int noOfIteration = 1000000;
		int countZero = 0;
		int valueOfTickets = b[2];
		int i=0;
		search: for (i = 0; i < noOfIteration; i++) {
			int temp = 0;
			boolean flag = true;
			for (int j = 0; j < lenght - 1; j++) {
				// System.out.print(b[j]);

				if (b[lenght - 1] == 0) {
					lenght = lenght - 1;
					countZero++;
					if ((valueOfTickets-1) == countZero) {
						break search;
					}
				}

				temp = b[j];

				b[j] = b[j + 1];
				if (flag) {
					flag = false;
					temp = temp - 1;
				}
				b[j + 1] = temp;

			}
		}

		/*System.out.println();
		for (int j : b) {
			System.out.print(j + " ");
		}*/
		//System.out.println("count: "+ countZero);
		//System.out.println("time count:" +i);
		//System.out.println("valueOfTickets: "+ valueOfTickets);
		//System.out.println("No of iteration: " + noOfIteration);
		return i;
	}
	
	static long waitingTime(int[] a, int p) {

	      int n = a[0];
	        int[] b = new int[n];
	        for(int i=0; i<n; i++){
	            b[i]= a[i+1];
	        }
	        int length = b.length;
	        int noOfIteration= 1000000;
	        int countZero = 0;
	        int valueOfTicket = a[p];
	        int i =0;
	        exit:
	        for(i=0; i<noOfIteration; i++){
	            int temp = 0;
	            boolean flag = true;
	            for(int j=0; j<length-1; j++){
	                if(b[length-1]==0 ){
	                    length = length -1;
	                    countZero ++;
	                    if((valueOfTicket-1)==countZero){
	                        break exit;
	                    }
	                    
	                }
	                temp = b[j];
	                b[j]= b[j+1];
	                if(flag){
	                    flag = false;
	                    temp = temp -1;
	                }
	                b[j+1]= temp;
	            }
	        }
	        
	        return i;
	    }

}
