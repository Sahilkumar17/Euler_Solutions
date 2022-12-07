package codex;

public class even_fibonacci {
	public static void main(String args[]) {
		int n1=0,n2=1,n3,s=0;    		    
		 for(int i=2;i<1000000;i++)   
		 {    
		  n3=n1+n2;    
		  if(n3%2==0) {
			  s+=n3;
		  }
		  n1=n2;    
		  n2=n3;    
		 }
		 System.out.println("The sum of the even-valued terms="+s);
	}

}
