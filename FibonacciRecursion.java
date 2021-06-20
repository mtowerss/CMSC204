/**
@author Matthew Towers
*/
public class FibonacciRecursion {
	public static void main(String[] args) {
		
		System.out.println(fibonacci(25));
			
	}
	
	public static long fibonacci(int n){
	   
	    long[] cache = new long[n+1];
	    return fibonacciCached(n, cache);
	}
	
	public static long fibonacciCached(int n, long[] cache) {
		if (n == 0 || n == 1) { 
			return n;
		}
		
		if (cache[n] == 0) {
			cache[n] = fibonacciCached(n-1, cache) + fibonacciCached(n-2, cache);
		}
		return cache[n];
	} 

}
