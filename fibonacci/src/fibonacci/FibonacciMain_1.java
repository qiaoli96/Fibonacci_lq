package fibonacci;

import java.math.BigDecimal;

public class FibonacciMain_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//×÷Õß£ºÀîÇÄ
		for(int i=0;i < 200;i++){
			System.out.println("Fibonacci.of(" + (i+1) + ")=="+of(i+1));
			of(i);
		}
       
	}
	public static BigDecimal of(int n){
		BigDecimal a=new BigDecimal("1");
		BigDecimal b=new BigDecimal("1");
		BigDecimal c=new BigDecimal("0");;
		if(n==1 || n==2){
			return a;
		}
		for(int i = 3;i <= n; i++){
			c = a.add(b);
			a = b;
			b = c;
		}
		return c;
	}
}
