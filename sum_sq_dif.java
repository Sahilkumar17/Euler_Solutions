package codex;

public class sum_sq_dif {

	public static void main(String[] args) {
		int s1=0,s2=0,d;
		for(int i=1;i<=100;i++) {
			s1=s1+(i*i);
			s2=s2+i;
		}
		d=(s2*s2)-s1;
		System.out.println("The difference between the sum of the squares of the first one hundred natural numbers and the square of the sum is "+d);
	}

}
