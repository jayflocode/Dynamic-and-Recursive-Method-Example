package CEN3024C;

public class Dynamic extends Thread {
	
	
       public static int fibonacci(int n) {
		
		if (n == 0) {
			
			return 0;
		}
		
		if (n == 1) {
			
			return 1;
			
		}
		
		int v1 = 0;  
		int v2 = 1;
		int v3 = 0;
	
		
		for (int i = 2; i <= n; i++) {    
			
			v3 = v1 + v2;
			v1 = v2;
			v2 = v3;
			
		}
		
		
		return v3;
	}  
       
       
       public void run() {   //thread run for recursive method
   		
   		int fiboValue = 0; // assigning value starting at 0 
   		
   		
   		while (fiboValue != 21) {  //ending values at 20 
   		
   		long startThread = System.nanoTime(); // start 
   		
   		fibonacci(fiboValue);  //value of fibonacci
   		
   		long endThread = System.nanoTime();  //end of thread time in nano
   		
   		
   		long total = endThread - startThread; //total time taken
   		
   		//print statement
   		System.out.println("Iterative Thread found the answer for fibonacci value of " + fiboValue + "(" + fibonacci(fiboValue) + ")" +  " in " + total + " nanoseconds");
   		
   		//increasing value count
   		fiboValue++;  
   		
   		}
   		
   	}
	
	

}
