package variable;

public class Assignment1 {
	int a = 10;	//Member 변수(Instance 변수)
				//(클래스 로딩 시, 생성자에 로딩되었을 때(ex:new)Heap에 메모리가 할당되며 그때 Instance 변수로 된다.)
	
	static int b = 20;	//Static 변수
						//Static영역에 메모리가 할당되며, 정적인 영역이고 클래스 로딩 시, 최우선으로 메모리에 할당이 된다.
	
	public static void main(String[] args) {
		int c = 2;		//Local 변수
						//Stack영역에 메모리가 할당되며, 함수가 실행될 때 생성되고 함수가 종료되면 같이 소멸된다.
	}

}
