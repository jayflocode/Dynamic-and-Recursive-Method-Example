package CEN3024C;

public class Recursive extends Thread{
	
	
	public static int fibonacci(int n) {
		
		if (n == 0) {
			
			return 0;
			
			
		}
		
		
		if (n == 1) {
			
			
			return 1; 
		}
		
		
		return fibonacci(n - 1) + fibonacci (n -2);
		
		
		
	}
	
	
	public void run() {   //thread run for recursive method
		
		int fiboValue = 0; // assigning value starting at 0 
		
		
		while (fiboValue != 21) {  //ending values at 20 
		
		long startThread = System.nanoTime(); // start 
		
		fibonacci(fiboValue);  //value of fibonacci
		
		long endThread = System.nanoTime();  //end of thread time in nano
		
		
		long total = endThread - startThread; //total time taken
		
		//print statement
		System.out.println("Recursive Thread found the answer for fibonacci value of " + fiboValue + "(" + fibonacci(fiboValue) + ")" +  " in " + total + " nanoseconds");
		
		//increasing value count
		fiboValue++;  
		
		}
		
	}

	public static void main(String[] args) {
		
		
		Recursive recursive = new Recursive();  //creates object called recursive
		Dynamic dyna = new Dynamic();
		
		recursive.start();  // start of thread 
		
		dyna.start();
		
		
		

	}

}
