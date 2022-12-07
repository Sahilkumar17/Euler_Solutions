package codex;
public class Pythagorian_Triplet {
    public static void main(String[] args) {
        int pro=1;
        for(int a=1;a<=1000;a++){
            for (int b=a+1;b<=1000;b++){
                for(int c=b+1;c<=1000;c++){
                    int sum=a+b+c;
                    if((a*a+b*b==c*c)&&(sum==1000))
                        pro=a*b*c;
                }
            }
        }
        System.out.println(pro);
    }
}
