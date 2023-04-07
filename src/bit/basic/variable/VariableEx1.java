package bit.basic.variable;
//변수 (local(stack), static(static, class), instance(heap))
//클래스(설계도) ------> 객체(Object) : 사물 그 자체(속성 + 기능) => 내가 설계한 기능을 갖고 있는 데이터다.
//기본 Primitive | 참조 Reference
public class VariableEx1 {
	int y;	//instance변수(Heap)
	static int z;	//전역변수(Static)
	
	public void variableMethod1() {
		int x;	//지역변수(Stack)
		//x++;
		z++;
		y++;
	}
	
	public void variableMethod2() {
		//private int value;
		//static int view;
	}
	
	public static void main(String[] args) {
		VariableEx1 v1 = new VariableEx1();	//new => 동적으로 메모리를 할당한다.(heap)
											//메모리 할당 시킴
		VariableEx1 v2 = new VariableEx1();
		VariableEx1 v3 = new VariableEx1();
		
		System.out.println(v1.y);
		System.out.println(z);
		
		byte a = 10;
		byte b = 20;
	
		
		
	}
	

}
