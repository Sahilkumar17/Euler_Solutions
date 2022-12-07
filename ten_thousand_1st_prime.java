package codex;

public class ten_thousand_1st_prime {
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
	public static void main(String args[]) {
		int c=0;
		for(int i=2;;i++) {
			if(isPrime(i)==true)
			{
				c++;					
				}
			if(c==10001) {
				System.out.println("The 10001st prime number is "+i);
				break;
			}

			}
	}
}
