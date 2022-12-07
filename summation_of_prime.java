package codex;

public class summation_of_prime {
	 public static boolean isPrime(long n) {  
	       if (n <= 1) {  
	           return false;  
	       }  
	       for (int i=2;i<=Math.sqrt(n);i++) {  
	           if (n % i == 0) {  
	               return false;  
	           }  
	       }  
	       return true;  
	   }

	public static void main(String[] args) {
		long sum=0;
		for(long i=2;i<1000000;i++) {
			if(isPrime(i)==true) {
				sum+=i;
			}
		}
		System.out.println("The sum of all the primes below two million is "+sum);
	}

}
