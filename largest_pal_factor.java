package codex;

public class largest_pal_factor {
	
	public static boolean isPalindrome(int n) {
		int num=n;
		int p=0;
		while(n>0) {
			p=p*10+n%10;
			n/=10;
		}
		if(p==num)
			return true;
		return false;
	}
	public static void main(String[] args) {
		int pro=100,p=1;
		for(int i=100;i<=999;i++) {
			for(int j=100;j<=999;j++) {
				p=i*j;
				if(isPalindrome(p)) {
					if(p>pro)
						pro=p;
				}
				
			}
		}
		System.out.println(pro);
	}

}
