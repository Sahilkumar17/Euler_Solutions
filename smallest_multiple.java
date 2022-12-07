package codex;

public class smallest_multiple {

	public static void main(String[] args) {
		int c=0;
		for(int i=20;;i++) {
			for(int j=1;j<=20;j++) {
				if(i%j==0) {
					c++;
				}
			}
			if(c==20)
			{
				System.out.println("The smallest positive number that is evenly divisible by all of the numbers from 1 to 20 is "+i);
				break;
			}
			else {
				c=0;
			}
		}
	}
}
