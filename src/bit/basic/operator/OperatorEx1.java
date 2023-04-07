package bit.basic.operator;
//최우선 () . []
//단항
//논리
public class OperatorEx1 {
		
	
	public int firstOperator(int x, int y, int z, int k) {
		return x>y?(x+y*z*k):(x+y)*z*k;
		
	}
	
	public int[] firstOperator(int... x) {
		return x;
	}
	
	public void logicMethod(int x, int y, int z) {
		boolean b = ++x==1 && y++==2 || ++z==4;
		System.out.println("B="+b+" x="+x+" y="+y+" z="+z);
	}
	
	public static void main(String[] args) {
		OperatorEx1 o1 = new OperatorEx1();
		o1.firstOperator(1,2,3,4);		//call by value
		int a = o1.firstOperator(1,2,3,4,5,6,7,8,9)[0];			//call by reference
		
		o1.logicMethod(1,2,3);
	}
	
}
