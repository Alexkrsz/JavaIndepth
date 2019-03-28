public class Recursion {
	
	static int factorialNR(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		
		int factorial = n;
				
		while (n >= 2) { 
			factorial = factorial * (n - 1); // 4 * 3 = 12 * 2 = 24 * 1 = 24
			n--; // 3, 2, 1
		}
	
		return factorial;
	}
	
	            	    	   
	static int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		return n * factorial(n-1);     
    }
	

		
	
	public static void main(String[] args) {
        System.out.println(factorialNR(4));	
		System.out.println(factorial(4));	// Clearer Code (slightly slow)   		

    }
}

/*
  When recursion?
      Problem addressed via similar sub-problems
      e.g., Binary Search, Towers of Hanoi, Word Frequency Count
*/