package codex;
import java.io.*;
public class power_digit_sum {

	public static void main(String[] args) {
		double a1=Math.pow(2,1000);
		int a=(int)a1;
		int r,sum=0;
		while(a>0) {
			r=a%10;
			sum+=r;
			a=a/10;
		}
		System.out.println( "The sum of the digits of the number 2^1000 is "+sum);
	}

}
