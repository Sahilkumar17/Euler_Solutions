package codex;
public class prime_factor {
	public static boolean isPrime(long n) {
		long count=0;
		for(long i=1;i<=n/2;i++) {
			if(n%i==0)
				count++;
		}
		if(count==1)
			return true;
		return false;
	}
	public static void main(String[] args) {		
		long n=600851475143L, fact =2;
		for(long i=1;i<=n;i++) {
			System.out.println(i);
			if(n%i==0) {
				if(isPrime(i))
					if(fact<i)
						fact=i;
					
			}
		}
		System.out.println("Largest Prime Factor:"+fact);

	}

}
