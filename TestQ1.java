package test2;
import java.util.*;

interface AdvancedArithmetic{
	int divisor_sum(int n);

}

class MyCalculator implements AdvancedArithmetic{

	@Override
	public int divisor_sum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			if((n%i)==0)
				sum+=i;
																							//sum+=((n%i)==0)?i:0;
		}
		return sum;
	}
	
}
public class TestQ1 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		MyCalculator mc=new MyCalculator();
		System.out.println(mc.divisor_sum(n));
	}

}
